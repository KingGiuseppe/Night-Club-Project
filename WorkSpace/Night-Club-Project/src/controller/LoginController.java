package controller;

import bags.GuestAccountBag;
import model_for_login.LoginEventListener;
import model_for_login.LoginObject;
import view_for_login.Main_Window;

public class LoginController {

	public LoginController(GuestAccountBag model, Main_Window view) {
		
		view.setLoginListener(new LoginEventListener() {

			@Override
			public void loginBtnClicked(LoginObject ev) {
				System.out.println("Here 1 " + ev.getUsername() + " " + ev.getPassword());
				
				System.out.println(model.getUser(ev.getUsername(), ev.getPassword()));
				
				
				
			}
			
		});
	}
}
