package model_for_login;

import java.util.EventObject;

import model_for_newuser.NewUser;

public class ForgotPassObject2 extends EventObject {

	private String username;
	private String password;

	public ForgotPassObject2(Object source,String username, String password) {
		super(source);
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPass() {
		return password;
	}

}
