package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import alerts.AccountCreatedAlert;
import model_for_newuser.NewUser;
import model_for_newuser.NewUserEventListener;
import model_for_newuser.NewUserObject;
import view_for_login.Main_Window;

public class NewUserController {

	public NewUserController(Main_Window view) {

		view.setNewUserEventListener(new NewUserEventListener() {

			private String host = "localhost";
			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;

			@Override
			public void createBtnClicked(NewUserObject ev) {
				try {
					Socket socket = new Socket(host, 8000);
					NewUser account = null;
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject(ev);
					boolean added;
					while (true) {
						added = (boolean) fromServer.readObject();
						if (added == true) {
							AccountCreatedAlert aca = new AccountCreatedAlert();
							break;
						} else {
							break;
						}

					}

				} catch (IOException | ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}

		});

	}
}
