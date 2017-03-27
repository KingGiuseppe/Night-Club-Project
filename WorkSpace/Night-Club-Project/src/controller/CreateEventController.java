package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.EventObject;

import alerts.EventCreatedAlert;
import listener.ButtonListener;
import listener.ButtonsEventListener;
import model_for_event_creation.CreateEventListener;
import model_for_event_creation.CreateEventObject;
import view_for_login.Main_Window;
import view_for_manager.ManagerPane;

public class CreateEventController {

	public CreateEventController(ButtonsEventListener listener) {
		listener.setEventListener(new ButtonListener() {

			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;
			private String host = "24.187.104.229";

			@Override
			public void btnClicked(EventObject ev) {
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
