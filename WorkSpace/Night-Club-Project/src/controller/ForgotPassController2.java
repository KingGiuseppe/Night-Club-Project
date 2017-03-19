package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import alerts.PasswordChangedAlert;
import bags.AccountBag;
import bags.DataBase;
import model_for_login.ForgotPassEventListener2;
import model_for_login.ForgotPassObject;
import model_for_login.ForgotPassObject2;
import view_for_login.ForgotPasswordPane;
import view_for_login.ForgotPasswordPane2;
import view_for_login.Main_Window;

public class ForgotPassController2 {

	public ForgotPassController2(DataBase model, Main_Window view) {
		view.setForgotPassEventListener2(new ForgotPassEventListener2() {
			
			private String host = "localhost";
			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;

			@Override
			public void forgotPassBtnClicked2(ForgotPassObject2 ev) {
				try {
					Socket socket = new Socket(host , 8000);
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject(ev);
					
					boolean accountFound;
					while (true) {
						accountFound = (boolean) fromServer.readObject();
						if(accountFound == true) {
							PasswordChangedAlert alert2 = new PasswordChangedAlert();
							ForgotPasswordPane.getStage().close();
							break;
						} else {
							System.out.println("FAILED");
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
