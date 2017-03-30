package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.EventObject;

import alerts.AlertForLogin;
import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import model_for_newuser.NewUser;
import view.login_panel.stage.LoginStage;
import view_for_guest.GuestPane;
import view_for_manager.ManagerPane;
import view_for_owner.OwnerPane;

public class LoginController {

	private String host = "24.187.104.229";
	private ObjectOutputStream toServer;
	private ObjectInputStream fromServer;

	public LoginController(ButtonEventListenerMethods listener) {

		listener.setEventListener(new ButtonListener() {

			@Override
			public void btnClicked(EventObject ev) {
				try {
					Socket socket = new Socket(host, 8000);
					NewUser account = null;
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject(ev);

					while (true) {
						account = (NewUser) fromServer.readObject();
						if (account == null) {
							AlertForLogin badLogin = new AlertForLogin();
							break;
						} else {
							AlertForLogin badLogin = new AlertForLogin(account.getFirstName());
							if (account.getType() == 0) {
								GuestPane.showStage();
								GuestPane.setUser(account);
								LoginStage.closeStage();
								break;
							}
							if (account.getType() == 1) {
								ManagerPane.showStage();
								LoginStage.closeStage();
								break;
							}
							if (account.getType() == 2) {
								OwnerPane.showStage();
								LoginStage.closeStage();
								break;
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
