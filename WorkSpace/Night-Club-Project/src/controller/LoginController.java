package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;
import java.util.EventObject;
import Listeners.ButtonListener;
import bags.AccountBag;
import bags.DataBase;
import buttons_for_login_panel.ButtonsForLoginPanel;
import javafx.application.Platform;
import model_for_login.LoginObject;
import model_for_newuser.NewUser;
import view_for_guest.GuestPane;
import view_for_login.Main_Window;

public class LoginController {

	private String host = "localhost";
	private ObjectOutputStream toServer;
	private ObjectInputStream fromServer;

	public LoginController(DataBase model, Main_Window view) {

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
							ButtonsForLoginPanel.setIsLoginValid(false);
							break;
						} else {
							System.out.println("FOUND! " + account.getFirstName());
							GuestPane.setUser(account);
							ButtonsForLoginPanel.setIsLoginValid(true);
							ButtonsForLoginPanel.setUser(account);
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
