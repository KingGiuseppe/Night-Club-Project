package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.EventObject;

import alerts.PasswordChangedAlert;
import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import view.login_panel.forgot_password.stage.ForgotPasswordStage;

public class ForgotPassController2 {

	public ForgotPassController2(ButtonEventListenerMethods listener) {
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

					boolean accountFound;
					while (true) {
						accountFound = (boolean) fromServer.readObject();
						if (accountFound == true) {
							new PasswordChangedAlert();
							ForgotPasswordStage.closeStage();
							break;
						} else {
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
