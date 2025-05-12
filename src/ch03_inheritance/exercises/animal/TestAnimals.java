package ch03_inheritance.exercises.animal;

public class TestAnimals {

	public static void main(String[] args) {
		// (1) Constructors and toString()
		Animal a = new Animal("a_animal");
		System.out.println(a); // invoke a.toString()
		// Animal[name=a_animal]
		
		Mammal m = new Mammal("m_mammal");
		System.out.println(m); // invoke m.toString()
		// Mammal[Animal[name=m_mammal]]
		
		Cat c = new Cat("elizabeth");
		System.out.println(c); // invoke c.toString()
		// Cat[Mammal[Animal[name=elizabeth]]]
		
		Dog d = new Dog("tokyo");
		System.out.println(d); // invoke d.toString()
		// Dog[Mammal[Animal[name=tokyo]]]
		
		System.out.println();
		
		// (2) Test greets methods
		
		c.greets();
		// Meow
		d.greets();
		// Woof
		Dog d2 = new Dog("Ceasar");
		d.greets(d2);
		// Woooof	
	}
}