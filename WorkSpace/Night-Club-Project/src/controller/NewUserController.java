package controller;

import bags.GuestAccountBag;
import model.NewUser;
import model.NewUserEventListener;
import model.NewUserObject;
import view_for_login.ButtonsForNewUserPanel2;

public class NewUserController {
	
	public NewUserController(GuestAccountBag model, ButtonsForNewUserPanel2 view) {
		//two button listeners to save the data in here then add it to the model
		
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
				System.out.println(firstname);
				model.addGuestAcc(new NewUser(firstname, lastname, gender, zip, email, 
						username, password, 0));
				
				
			}
			
		});
		
		
		
	}
}
