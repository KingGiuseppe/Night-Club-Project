package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.EventObject;

import listener.ButtonListener;
import listener.ButtonsEventListener;
import model_for_event_creation.CreateEventPaneObject;
import model_load_events.GetEventsListener;
import view_for_guest.EventsPanel;
import view_for_guest.GuestPane;
import view_for_login.Main_Window;
import view_for_manager.ManagerPane;
import view_for_owner.OwnerPane;

public class GetEventsController {
	private String host = "24.187.104.229";
	private ObjectOutputStream toServer;
	private ObjectInputStream fromServer;
	private ArrayList<CreateEventPaneObject> eventsList;

	public GetEventsController(ButtonsEventListener listener) {

		listener.setEventListener(new ButtonListener() {

			@Override
			public void btnClicked(EventObject ev) {
				try {
					Socket socket = new Socket(host, 8000);
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject("Get Events");

					while (true) {
						eventsList = (ArrayList<CreateEventPaneObject>) fromServer.readObject();

						if (eventsList == null) {
							break;
						}

						else {

							if (ev.getSource().equals(1)) {
								EventsPanel ep = new EventsPanel(0);
								GuestPane.getStage().setScene(ep.getScene());
							} else if (ev.getSource().equals(2)) {
								EventsPanel ep = new EventsPanel(1);
								ManagerPane.getStage().setScene(ep.getScene());
							} else if (ev.getSource().equals(3)) {
								EventsPanel ep = new EventsPanel(2);
								OwnerPane.getStage().setScene(ep.getScene());
							}

							for (int i = 0; i < eventsList.size(); i++) {
								eventsList.get(i).setPane();
								EventsPanel.getEventPane().getChildren().add(eventsList.get(i).getPane());
							}
							break;
						}
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}

		});
	}
}
