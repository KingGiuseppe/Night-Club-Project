package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.EventObject;

import alerts.AccountCreatedAlert;
import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import model_for_newuser.NewUser;
import model_for_newuser.NewUserObject;
import view.login_panel.new_user.scenes.NewUserPanel1;
import view.login_panel.new_user.stage.NewUserStage;

public class NewUserController {

	public NewUserController(ButtonEventListenerMethods listener) {

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
					boolean added;
					while (true) {
						added = (boolean) fromServer.readObject();
						if (added == true) {
							AccountCreatedAlert aca = new AccountCreatedAlert();
							NewUserStage.closeStage();
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
