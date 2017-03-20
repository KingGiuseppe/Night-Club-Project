package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import Listeners.ButtonListener2;
import alerts.AlertForLogin;
import bags.DataBase;
import buttons_for_login_panel.ButtonsForLoginPanel;
import model_for_newuser.NewUser;
import view_for_guest.GuestPane;
import view_for_login.Main_Window;
import view_for_manager.ManagerPane;
import view_for_manager.PaneForRemoveEvent;
import view_for_owner.OwnerPane;
import view_for_owner.SchedulingPane;

public class SchedulingController {
	
	private String host = "localhost";
	private ObjectOutputStream toServer;
	private ObjectInputStream fromServer;
	

	public SchedulingController(Main_Window view) {
		Main_Window.getListener().setEventListener2(new ButtonListener2() {

			@Override
			public void btnClicked(int i) {
				
				
				try {
					Socket socket = new Socket(host, 8000);
					ArrayList<NewUser> managerList = null;
					toServer = new ObjectOutputStream(socket.getOutputStream());
					fromServer = new ObjectInputStream(socket.getInputStream());
					toServer.writeObject("Find Managers");

					while (true) {
						managerList = (ArrayList<NewUser>) fromServer.readObject();
						if (managerList == null) {
							break;
						} else {
							SchedulingPane.setManagerList(managerList);
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
