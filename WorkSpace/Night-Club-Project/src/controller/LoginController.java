package controller;

import java.sql.SQLException;
import java.util.EventObject;
import Listeners.ButtonListener;
import bags.AccountBag;
import bags.DataBase;
import buttons_for_login_panel.ButtonsForLoginPanel;
import model_for_login.LoginObject;
import panes_for_login.Main_Window;
import view_for_guest.GuestPane;

public class LoginController {

	public LoginController(DataBase model, Main_Window view) {

		view.setEventListener(new ButtonListener() {

			@Override
			public void btnClicked(EventObject ev) {
				try {
					if(model.getLoginVerification(((LoginObject) ev).getUsername() , ((LoginObject) ev).getPassword()) == true) {
						GuestPane.setUser(model.getAccount(((LoginObject) ev).getUsername(), ((LoginObject) ev).getPassword()));
						ButtonsForLoginPanel.setIsLoginValid(true);
						ButtonsForLoginPanel.setUser(model.getAccount(((LoginObject) ev).getUsername(), ((LoginObject) ev).getPassword()));
					} else {
						ButtonsForLoginPanel.setIsLoginValid(false);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}

		});
	}
}
