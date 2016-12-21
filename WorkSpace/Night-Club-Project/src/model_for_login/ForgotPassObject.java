package model_for_login;

import java.util.EventObject;

import model_for_newuser.NewUser;

public class ForgotPassObject extends EventObject {

	private String username;
	private String email;
	private NewUser user;
	
	public ForgotPassObject(Object source, NewUser user){
		super(source);
		this.user = user;
	}
	
	
	public NewUser getUser() {
		return user;
	}


	public ForgotPassObject(Object source) {
		super(source);
	}
	
			
	public ForgotPassObject(Object source, String username, String email) {
		super(source);
		this.username = username;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	
	
}
