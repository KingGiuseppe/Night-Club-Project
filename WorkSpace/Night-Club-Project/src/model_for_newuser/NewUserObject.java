package model_for_newuser;

import java.util.EventObject;

public class NewUserObject extends EventObject {
	private String firstName;
	private String lastName;
	private String gender;
	private String zip;
	private String email;
	private String username;
	private String password;
	private int type;

	public NewUserObject(Object source, String firstName, String lastName, String gender, String zip, String email,
			String username, String password, int type) {
		super(source);
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.zip = zip;
		this.email = email;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public NewUserObject(Object source) {
		super(source);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
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
