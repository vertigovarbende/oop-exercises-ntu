package ch06_abstractClasses_interfaces.introduction;

public class TestAbstractShape {

	public static void main(String[] args) {

		AbstractShape s1 = new Rectangle("red", 4, 5); // Upcast
		System.out.println(s1); // Run Rectangle's toString()
		// Rectangle[length=4,width=5,Shape[color=red]]
		System.out.println("Area is " + s1.getArea()); // Run Rectangle's getArea()
		// Area is 20.0

		AbstractShape s2 = new Triangle("blue", 4, 5); // Upcast
		System.out.println(s2); // Run Triangle's toString()
		// Triangle[base=4,height=5,Shape[color=blue]]
		System.out.println("Area is " + s2.getArea()); // Run Triangle's getArea()
		// Area is 10.0
	}
}
