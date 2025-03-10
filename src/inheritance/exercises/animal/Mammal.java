package inheritance.exercises.animal;

public class Mammal extends Animal {
	// the subclass of Animal

	// Constructor

	// +Mammal(name: String)
	public Mammal(String name) {
		super(name);
	}

	// toString()
	@Override
	public String toString() {
		return "Mammal[" + super.toString() + "]";
	}
}