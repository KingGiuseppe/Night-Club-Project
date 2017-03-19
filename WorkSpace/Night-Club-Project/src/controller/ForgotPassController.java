package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import bags.AccountBag;
import bags.DataBase;
import model_for_event_creation.CreateEventPaneObject;
import model_for_login.ForgotPassEventListener;
import model_for_login.ForgotPassObject;
import view_for_guest.EventsPanel;
import view_for_guest.GuestPane;
import view_for_login.ForgotPasswordPane;
import view_for_login.ForgotPasswordPane2;
import view_for_login.Main_Window;
import view_for_manager.ManagerPane;
import view_for_owner.OwnerPane;

public class ForgotPassController {

	public ForgotPassController(DataBase model, Main_Window view) {
		view.setForgotPassEventListener(new ForgotPassEventListener() {

			private String host = "localhost";
			private ObjectOutputStream toServer;
			private ObjectInputStream fromServer;

			@Override
			public void forgotPassBtnClicked(ForgotPassObject ev) {
				try {
					Socket socket = new Socket(host , 8000);
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject(ev);
					
					boolean accountFound;
					while (true) {
						accountFound = (boolean) fromServer.readObject();
						if(accountFound == true) {
							ForgotPasswordPane.setUser(ev.getUsername(), ev.getEmail());
							ForgotPasswordPane2.setUser(ev.getUsername(), ev.getEmail());
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
