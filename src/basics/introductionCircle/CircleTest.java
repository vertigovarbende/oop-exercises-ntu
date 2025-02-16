package basics.introductionCircle;

public class CircleTest {

	public static void main(String[] args) {
		// Test all constructors and toString()
		Circle c1 = new Circle(2.4, "Black"); // Third constructor
		System.out.println(c1.toString()); // Explicitly calling toString()
		System.out.println(c1); // implicitly call to c1.toString()
		System.out.println("c1 is: " + c1); // '+' invokes toString() to get a String before concatenation

		Circle c2 = new Circle(3.3); // Second constructor
		System.out.println(c2); 
		
		Circle c3 = new Circle(); // Default constructor
		System.out.println(c3);
		
		System.out.println();
		
		// Test Setter and Getters
		c1.setRadius(4.2);
		c1.setColor("Yellow");
		System.out.println(c1); // Circle[4.2,Yellow]
		System.out.println("c1 radius: " + c1.getRadius());
		System.out.println("c1 color: " + c1.getColor());
		
		// Test getArea() and getCircumference()
		System.out.printf("The area is: %.2f\n", c1.getArea());
		System.out.printf("The circumference is: %.2f", c1.getCircumference());
		
		
		
	}

}
