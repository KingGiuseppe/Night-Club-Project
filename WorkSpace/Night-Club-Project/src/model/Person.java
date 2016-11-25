package model;

public class Person {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String zip;
	private final String id;
	private static int idInt;
	
	public Person(String firstName, String lastName, String gender, String zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.zip = zip;
		this.id = String.valueOf(idInt++);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public static int getIdInt() {
		return idInt;
	}

	public static void setIdInt(int idInt) {
		Person.idInt = idInt;
	}

	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Person [firstName: " + firstName + ", lastName: " + lastName + ", gender: " + gender + ", zip: " + zip
				+ ", id: " + id + "] ";
	}

	
}
