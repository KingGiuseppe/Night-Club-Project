package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import bags.DataBase;
import model_for_event_creation.CreateEventPaneObject;
import model_for_newuser.NewUser;
import model_load_events.GetEventsListener;
import view_for_guest.EventsPanel;
import view_for_guest.GuestPane;
import view_for_login.Main_Window;

public class GetEventsController {
	private String host = "localhost";
	private ObjectOutputStream toServer;
	private ObjectInputStream fromServer;

	public GetEventsController(DataBase model, Main_Window view) {

		view.setGetEventListener(new GetEventsListener() {

			@Override
			public void getEventsBtnClicked() {
				try {
					Socket socket = new Socket(host, 8000);
					ArrayList<CreateEventPaneObject> eventsList = null;

					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject("Get Events");

					while (true) {
						eventsList = (ArrayList<CreateEventPaneObject>) fromServer.readObject();

						if (eventsList == null) {
							System.out.println("NO EVENTS");
							break;

						}

						else {
							System.out.println("HERE 2");
							GuestPane.getStage().setScene(EventsPanel.getScene());
							for(int i = 0; i < eventsList.size(); i++){
								System.out.println(eventsList.get(i).getArtist());
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
