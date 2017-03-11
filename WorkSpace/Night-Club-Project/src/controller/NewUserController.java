package controller;

import bags.AccountBag;
import model_for_newuser.NewUser;
import model_for_newuser.NewUserEventListener;
import model_for_newuser.NewUserObject;
import view_for_login.Main_Window;

public class NewUserController {

	public NewUserController(AccountBag model, Main_Window view) {

		view.setNewUserEventListener(new NewUserEventListener() {

			@Override
			public void createBtnClicked(NewUserObject ev) {
				model.addGuestAcc(new NewUser(ev.getFirstName(), ev.getLastName(), ev.getGender(), ev.getZip(),
						ev.getEmail(), ev.getUsername(), ev.getPassword(), 0));
			}

		});

	}
}
