package model;

public class NewUser {

	private String firstName;
	private String LastName;
	private String gender;
	private String zip;
	private String email;
	private String username;
	private String password;
	private int type;
	private final String id;
	private static int idInt;

	
	public NewUser(String firstName, String lastName, String gender, String zip) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.zip = zip;
		this.email = email;
		this.username = username;
		this.password = password;
		this.id = String.valueOf(idInt++);
	}
	public NewUser(String firstName, String lastName, String gender, String zip, String email, String username,
			String password) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.zip = zip;
		this.email = email;
		this.username = username;
		this.password = password;
		this.id = String.valueOf(idInt++);
	}
	public NewUser(String firstName, String lastName, String gender, String zip, String email, String username,
			String password, int type) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.zip = zip;
		this.email = email;
		this.username = username;
		this.password = password;
		this.id = String.valueOf(idInt++);
		this.type = type;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	
	
}
