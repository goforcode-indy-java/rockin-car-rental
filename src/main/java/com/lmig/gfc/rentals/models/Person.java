package com.lmig.gfc.rentals.models;

public class Person {
	
	private String firstName;
	private String lastName;
	private String license;
	private String state;

	public Person(String firstName, String lastName, String license, String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.license = license;
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}
	
}
