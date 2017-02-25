package controller;

import java.util.EventObject;

import Listeners.ButtonListener;
import bags.AccountBag;
import model_for_login.LoginObject;
import model_for_scheduling.SchedEventObj;
import view_for_guest.GuestPane;
import view_for_login.ButtonsForLoginPanel;
import view_for_login.Main_Window;

public class LoginController {

	public LoginController(AccountBag model, Main_Window view) {

		view.setEventListener(new ButtonListener() {

			@Override
			public void btnClicked(EventObject ev) {

				if (model.getUser(((LoginObject) ev).getUsername(), ((LoginObject) ev).getPassword()) != null) {
					GuestPane.setUser(model.getUser(((LoginObject) ev).getUsername(), ((LoginObject) ev).getPassword()));
					ButtonsForLoginPanel.setIsLoginValid(true);
					ButtonsForLoginPanel.setUser(model.getUser(((LoginObject) ev).getUsername(), ((LoginObject) ev).getPassword()));
					
				} else {
					ButtonsForLoginPanel.setIsLoginValid(false);
				}

			}

		});
	}
}
