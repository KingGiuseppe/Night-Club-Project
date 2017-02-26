package model_for_newuser;

public class NewUser extends Person {

	private String email;
	private String username;
	private String password;
	private int type;

	public NewUser(String firstName, String lastName, String gender, String zip, String email, String username,
			String password, int type) {
		super(firstName, lastName, gender, zip);
		this.email = email;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNewUser [email: " + email + ", username=" + username + ", password: " + password
				+ ", type: " + type;

	}

}