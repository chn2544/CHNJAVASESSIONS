package ConstructorConcept;

import java.util.ArrayList;

public class Customer {
	
	String name;
	int id;
	String dob;
	String phone;
	String city;
	boolean isActive;
	ArrayList<String> cardsList;

	public Customer(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Customer(String name, int id, String dob) {
		this.name = name;
		this.id = id;
		this.dob = dob;
	}

	public Customer(String name, int id, String phone, String city) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.city = city;
	}

	public Customer(String name, int id, boolean isActive) {
		this.name = name;
		this.id = id;
		this.isActive = isActive;
	}

	public Customer(String name, int id, String dob, String phone, String city, boolean isActive, ArrayList<String> cardsList) {
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.phone = phone;
		this.city = city;
		this.isActive = isActive;
		this.cardsList = cardsList;
	}

}
