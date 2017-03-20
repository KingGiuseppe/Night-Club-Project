package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.EventObject;
import Listeners.ButtonListener;
import alerts.AlertForLogin;
import buttons_for_login_panel.ButtonsForLoginPanel;
import model_for_newuser.NewUser;
import view_for_guest.GuestPane;
import view_for_login.Main_Window;
import view_for_manager.ManagerPane;
import view_for_owner.OwnerPane;

public class LoginController {

	private String host = "localhost";
	private ObjectOutputStream toServer;
	private ObjectInputStream fromServer;

	public LoginController(Main_Window view) {

		view.setEventListener(new ButtonListener() {

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
								ButtonsForLoginPanel.setUser(account);
								Main_Window.closeStage();
								break;
							}
							if (account.getType() == 1) {
								ManagerPane.showStage();
								ManagerPane.setMessage();
								ButtonsForLoginPanel.setUser(account);
								Main_Window.closeStage();
								break;
							}
							if (account.getType() == 2) {
								OwnerPane.showStage();
								ButtonsForLoginPanel.setUser(account);
								Main_Window.closeStage();
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
