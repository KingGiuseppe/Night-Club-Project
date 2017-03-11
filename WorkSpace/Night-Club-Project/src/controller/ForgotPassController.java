package controller;

import bags.AccountBag;
import model_for_login.ForgotPassEventListener;
import model_for_login.ForgotPassObject;
import view_for_login.ForgotPasswordPane;
import view_for_login.ForgotPasswordPane2;
import view_for_login.Main_Window;

public class ForgotPassController {

	public ForgotPassController(AccountBag model, Main_Window view) {
		view.setForgotPassEventListener(new ForgotPassEventListener() {

			@Override
			public void forgotPassBtnClicked(ForgotPassObject ev) {

				if (model.getUser2(ev.getUsername(), ev.getEmail()) != null) {
					ForgotPasswordPane.setUser(model.getUser2(ev.getUsername(), ev.getEmail()));
					ForgotPasswordPane2.setUser(model.getUser2(ev.getUsername(), ev.getEmail()));
					ForgotPasswordPane.setIsInfo(true);

				} else {
					ForgotPasswordPane.setIsInfo(false);
				}

			}

		});

	}
}
