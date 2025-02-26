package inheritance.introduction;

public class Person {
	
	// The private instance variables
	private String name;
	private String address;
	
	// Constructor
	// +Person(name: String, address: String)
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// Getter and Setter methods
	
	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}
	
	// Getter method for private instance variable 'address'
	public String getAddress() {
		return address;
	}
	
	// Setter method for private instance variable 'address'
	public void setAddress(String address) {
		this.address = address;
	}
	
	// +toString()
	public String toString() {
		return String.format("%s(%s)", name, address);
	}
}
