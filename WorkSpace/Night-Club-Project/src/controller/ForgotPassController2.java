package controller;

import bags.AccountBag;
import model_for_login.ForgotPassEventListener2;
import model_for_login.ForgotPassObject;
import view_for_login.Main_Window;

public class ForgotPassController2 {

	public ForgotPassController2(AccountBag model, Main_Window view) {
		view.setForgotPassEventListener2(new ForgotPassEventListener2() {

			@Override
			public void forgotPassBtnClicked2(ForgotPassObject ev) {
				model.setuser(ev.getUser());
			}

		});
	}
}
