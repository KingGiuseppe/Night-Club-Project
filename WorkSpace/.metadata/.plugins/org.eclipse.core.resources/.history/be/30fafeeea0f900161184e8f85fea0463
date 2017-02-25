 package controller;

import bags.AccountBag;
import model_for_newuser.NewUser;
import model_for_newuser.NewUserEventListener;
import model_for_newuser.NewUserObject;
import view_for_login.Main_Window;

public class NewUserController {
	
	public NewUserController(AccountBag model, Main_Window view) {
		
		view.setNewUserEventListener(new NewUserEventListener() {

			private String firstname;
			private String lastname;
			private String gender;
			private String zip;
			private String email;
			private String username;
			private String password;
			
			
			@Override
			public void createBtnClicked(NewUserObject ev) {
				firstname = ev.getFirstName();
				lastname = ev.getLastName();
				gender = ev.getGender();
				zip = ev.getZip();
				email = ev.getEmail();
				username = ev.getUsername();
				password = ev.getPassword();
				model.addGuestAcc(new NewUser(firstname, lastname, gender, zip, email, 
						username, password, 0));
			}
			
		});
		
		
		
	}
}
