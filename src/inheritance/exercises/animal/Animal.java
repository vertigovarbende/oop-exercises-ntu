package inheritance.exercises.animal;

public class Animal {
	// super class

	// The protected instance variable
	protected String name;

	// Constructor

	// +Animal(name: String)
	public Animal(String name) {
		this.name = name;
	}

	// toString()
	public String toString() {
		return "Animal[name=" + name + "]";
	}
}