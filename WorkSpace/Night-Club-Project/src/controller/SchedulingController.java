package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.EventObject;

import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import model_for_newuser.NewUser;
import view_for_owner.SchedulingPane;

public class SchedulingController {

	private String host = "24.187.104.229";
	private ObjectOutputStream toServer;
	private ObjectInputStream fromServer;

	public SchedulingController(ButtonEventListenerMethods listener) {
		listener.setEventListener(new ButtonListener() {

			@Override
			public void btnClicked(EventObject ev) {

				try {
					Socket socket = new Socket(host, 8000);
					ArrayList<NewUser> managerList = null;
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject("Find Managers");

					while (true) {
						managerList = (ArrayList<NewUser>) fromServer.readObject();
						if (managerList == null) {
							break;
						} else {
							SchedulingPane.setManagerList(managerList);
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
