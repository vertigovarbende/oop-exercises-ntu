package compositionInheritancePolymorphism.composition.customer.customer2;

public class Customer {

	// The private instance variables
	private int id;
	private String name;
	private char gender; // 'm' or 'f'

	// Constructor
	// +Customer(id:int, name:String, discount:int)
	public Customer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	// Setter and Getter methods

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

	// toString() method
	public String toString() {
		return String.format("%s(%d)", name, id);
	}
}
