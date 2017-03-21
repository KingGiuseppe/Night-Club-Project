package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import alerts.EventRemovedAlert;
import model_for_removeEv.RemoveEvEventListener;
import model_for_removeEv.RemoveEventObj;
import view_for_login.Main_Window;

public class RemoveEventController {

	public RemoveEventController(Main_Window view) {
		view.setRemoveEventListener(new RemoveEvEventListener() {

			private String host = "24.187.104.229";
			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;

			@Override
			public void removeEvBtnClicked(RemoveEventObj ev) {
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
