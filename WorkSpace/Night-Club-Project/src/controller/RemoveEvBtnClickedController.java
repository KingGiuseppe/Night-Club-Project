package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import bags.CreateEventBag;
import bags.DataBase;
import model_for_event_creation.CreateEventPaneObject;
import model_for_removeEv.RemoveEventBtnClickedEventListener;
import view_for_guest.EventsPanel;
import view_for_guest.GuestPane;
import view_for_login.Main_Window;
import view_for_manager.PaneForRemoveEvent;

public class RemoveEvBtnClickedController {
	
	public RemoveEvBtnClickedController(DataBase model, Main_Window view) {
		view.setRemoveEventBtnClickedEventListener(new RemoveEventBtnClickedEventListener() {
			
			private ObjectOutputStream toServer;
			private String host = "localhost";
			private ObjectInputStream fromServer;
			private ArrayList<CreateEventPaneObject> eventsList;

			@Override
			public void removeEventBtnClicked() {
				try {
					Socket socket = new Socket(host , 8000);
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
