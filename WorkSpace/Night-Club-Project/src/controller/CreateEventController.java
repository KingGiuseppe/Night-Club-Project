package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import alerts.EventCreatedAlert;
import model_for_event_creation.CreateEventListener;
import model_for_event_creation.CreateEventObject;
import view_for_login.Main_Window;
import view_for_manager.ManagerPane;

public class CreateEventController {

	public CreateEventController(Main_Window view) {
		view.setCreateEventListener(new CreateEventListener() {

			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;
			private String host = "localhost";

			@Override
			public void createEventBtnClicked(CreateEventObject ev) {
				try {
					Socket socket = new Socket(host, 8000);
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject(ev);

					while (true) {
						if ((boolean) fromServer.readObject() == true) {
							EventCreatedAlert eventAlert = new EventCreatedAlert();
							ManagerPane.getStage().setScene(ManagerPane.getScene());
							break;

						} else {
							break;
						}
					}

				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

			}

		});
	}

}
