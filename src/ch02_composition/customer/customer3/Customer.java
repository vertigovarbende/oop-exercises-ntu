package ch02_composition.customer.customer3;

public class Customer {

	// The private instance variables
	private int id;
	private String name;
	private char gender; // 'm' or 'f'

	// Constructor
	public Customer(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	// Getter methods

	// Getter method for private instance variable 'id'
	public int getId() {
		return id;
	}

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Getter method for private instance variable 'gender'
	public char getGender() {
		return gender;
	}

	// toString method
	@Override
	public String toString() {
		return String.format("%s(%d)", name, id);
	}

}
