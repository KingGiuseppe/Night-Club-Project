package model;

import java.util.EventObject;

public class NewUserObject extends EventObject {
	private String firstName;
	private String LastName;
	private String gender;
	private String zip;
	private String email;
	private String username;
	private String password;
	private int type;
	
	public NewUserObject(Object source) {
		super(source);
	}

	public NewUserObject(Object source, String email, String username, String password, int type) {
		super(source);
		this.email = email;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public NewUserObject(Object source, String firstName, String lastName, String gender, String zip) {
		super(source);
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.zip = zip;
	}

	public NewUserObject(Object arg0, String firstName, String lastName, String gender, String zip, String email,
			String username, String password, int type) {
		super(arg0);
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.zip = zip;
		this.email = email;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getGender() {
		return gender;
	}

	public String getZip() {
		return zip;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getType() {
		return type;
	}
	
}
