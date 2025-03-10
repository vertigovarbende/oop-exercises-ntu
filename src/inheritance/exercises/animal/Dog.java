package inheritance.exercises.animal;

public class Dog extends Mammal {

	// The subclass of Mammal

	// Constructor

	// +Dog(name: String)
	public Dog(String name) {
		super(name);
	}

	// +greets(): void
	public void greets() {
		System.out.println("Woof");
	}

	// +greets(another: Dog): void
	// overloaded
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	// toString()
	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}
}