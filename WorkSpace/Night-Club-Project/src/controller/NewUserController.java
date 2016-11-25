package controller;

import bags.GuestAccountBag;
import model.NewUser;
import model.NewUserEventListener;
import model.NewUserObject;
import view_for_login.Main_Window;

public class NewUserController {
	
	public NewUserController(GuestAccountBag model, Main_Window view) {
		
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
				System.out.println("Here 2");
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
