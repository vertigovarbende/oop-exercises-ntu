package ch03_inheritance.exercises.animal;

public class Cat extends Mammal {

	// The subclass of Mammal

	// Constructor

	// +Cat(name: String)
	public Cat(String name) {
		super(name);
	}

	// +greets(): void
	public void greets() {
		System.out.println("Meow");
	}

	// toString()
	@Override
	public String toString() {
		return "Cat[" + super.toString() + "]";
	}
}