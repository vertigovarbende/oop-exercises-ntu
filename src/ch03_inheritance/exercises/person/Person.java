package ch03_inheritance.exercises.person;

public class Person {

	// The protected instance variables
	protected String name;
	protected String address;

	// Constructor

	// +Person(name: String, address: String)
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// Getter and Setter methods

	// Getter method for instance variable 'name'
	public String getName() {
		return name;
	}

	// Getter method for instance variable 'address'
	public String getAddress() {
		return address;
	}

	// Setter method for instance variable 'address'
	public void setAddress(String address) {
		this.address = address;
	}

	// toString()
	public String toString() {
		return "Person[name=" + name + ",address=" + address + "]";
	}
}