package model_for_login;

import java.util.EventObject;

public class LoginObject extends EventObject {

	private String username;
	private String password;

	public LoginObject(Object source) {
		super(source);
	}

	public LoginObject(Object source, String username, String password) {
		super(source);
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
