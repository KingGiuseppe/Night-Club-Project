package controller;

import bags.GuestAccountBag;
import model_for_login.LoginEventListener;
import model_for_login.LoginObject;
import view_for_guest.GuestPane;
import view_for_login.ButtonsForLoginPanel;
import view_for_login.Main_Window;

public class LoginController {

	public LoginController(GuestAccountBag model, Main_Window view) {

		view.setLoginListener(new LoginEventListener() {

			@Override
			public void loginBtnClicked(LoginObject ev) {

				if (model.getUser(ev.getUsername(), ev.getPassword()) != null) {
					GuestPane.setUser(model.getUser(ev.getUsername(), ev.getPassword()));
					ButtonsForLoginPanel.setIsLoginValid(true);
					ButtonsForLoginPanel.setUser(model.getUser(ev.getUsername(), ev.getPassword()));
				} else {
					ButtonsForLoginPanel.setIsLoginValid(false);
				}

			}

		});
	}
}
