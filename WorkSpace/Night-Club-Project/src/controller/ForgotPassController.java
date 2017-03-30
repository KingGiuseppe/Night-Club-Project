package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.EventObject;

import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import model_for_login.ForgotPassObject;
import view_for_login.ForgotPasswordPane;
import view_for_login.ForgotPasswordPane2;

public class ForgotPassController {

	public ForgotPassController(ButtonEventListenerMethods listener) {
		
		listener.setEventListener(new ButtonListener() {

			private String host = "24.187.104.229";
			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;

			@Override
			public void btnClicked(EventObject ev) {
				ForgotPassObject forgotPassObj = (ForgotPassObject) ev.getSource();
				try {
					Socket socket = new Socket(host, 8000);
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject(forgotPassObj);

					boolean accountFound;
					while (true) {
						accountFound = (boolean) fromServer.readObject();
						if (accountFound == true) {
							ForgotPasswordPane.setUser(forgotPassObj.getUsername(), forgotPassObj.getEmail());
							ForgotPasswordPane2.setUser(forgotPassObj.getUsername(), forgotPassObj.getEmail());
							ForgotPasswordPane.setIsInfo(true);
							break;
						} else {
							ForgotPasswordPane.setIsInfo(false);
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
