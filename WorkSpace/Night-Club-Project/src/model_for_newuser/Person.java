package model_for_newuser;

import java.io.Serializable;

public class Person implements Serializable {

	private String firstName;
	private String lastName;
	private String gender;
	private String zip;
	
	public Person() {
		
	}

	public Person(String firstName, String lastName, String gender, String zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.zip = zip;
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

}
