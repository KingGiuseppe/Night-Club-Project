package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.EventObject;

import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import model_for_event_creation.CreateEventPaneObject;
import view_for_manager.PaneForRemoveEvent;

public class RemoveEvBtnClickedController {

	public RemoveEvBtnClickedController(ButtonEventListenerMethods listener) {
		
		listener.setEventListener(new ButtonListener() {

			private ObjectOutputStream toServer;
			private String host = "24.187.104.229";
			private ObjectInputStream fromServer;
			private ArrayList<CreateEventPaneObject> eventsList;

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
						} else {
							PaneForRemoveEvent.setEventsList(eventsList);
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
