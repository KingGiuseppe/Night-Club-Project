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
import view.manager_account.stage.ManagerStage;
import view.owner_account.stage.OwnerStage;
import view_for_guest.GuestPane;

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
							new AlertForLogin();
							break;
						} else {
							new AlertForLogin(account.getFirstName());
							if (account.getType() == 0) {
								new GuestPane();
								GuestPane.setUser(account);
								GuestPane.showStage();
								LoginStage.closeStage();
								break;
							}
							if (account.getType() == 1) {
								new ManagerStage();
								ManagerStage.showStage();
								LoginStage.closeStage();
								break;
							}
							if (account.getType() == 2) {
								new OwnerStage();
								OwnerStage.showStage();
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
