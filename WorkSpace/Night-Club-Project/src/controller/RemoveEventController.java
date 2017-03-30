package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.EventObject;

import alerts.EventRemovedAlert;
import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import model_for_removeEv.RemoveEventObj;

public class RemoveEventController {

	public RemoveEventController(ButtonEventListenerMethods listener) {
		
		listener.setEventListener(new ButtonListener() {

			private String host = "24.187.104.229";
			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;

			@Override
			public void btnClicked(EventObject ev) {
				try {
					Socket socket = new Socket(host, 8000);
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject(ev);
					boolean deleted;

					while (true) {
						deleted = (boolean) fromServer.readObject();
						if (deleted == true) {
							EventRemovedAlert alert = new EventRemovedAlert();
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
