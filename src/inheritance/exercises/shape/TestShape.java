package inheritance.exercises.shape;

public class TestShape {

	public static void main(String[] args) {
		// Test constructors and toString()

		// (1) Shape
		Shape s1 = new Shape();
		System.out.println(s1); // invoke s1.toString()
		// Shape[color=red,filled=true]

		Shape s2 = new Shape("green", false);
		System.out.println(s2); // invoke s2.toString()
		// Shape[color=green,filled=false]

		// (2) Circle
		Circle c1 = new Circle();
		System.out.println(c1); // invoke c1.toString()
		// Circle[Shape[color=red,filled=true],radius=1.0]

		Circle c2 = new Circle(3.2);
		System.out.println(c2); // invoke c2.toString()
		// Circle[Shape[color=red,filled=true],radius=3.2]

		Circle c3 = new Circle(3.14, "yellow", true);
		System.out.println(c3); // invoke c3.toString()
		// Circle[Shape[color=yellow,filled=true],radius=3.14]

		// (3) Rectangle
		Rectangle r1 = new Rectangle();
		System.out.println(r1); // invoke r1.toString()
		// Rectangle[Shape[color=red,filled=true],width=1.0,length=1.0]

		Rectangle r2 = new Rectangle(3, 4);
		System.out.println(r2); // invoke r2.toString()
		// Rectangle[Shape[color=red,filled=true],width=3.0,length=4.0]

		Rectangle r3 = new Rectangle(5, 2, "black", false);
		System.out.println(r3); // invoke r3.toString()
		// Rectangle[Shape[color=black,filled=false],width=5.0,length=2.0]

		// (4) Square
		Square sq1 = new Square();
		System.out.println(sq1); // invoke sq1.toString()
		// Square[Rectangle[Shape[color=red,filled=true],width=1.0,length=1.0]

		Square sq2 = new Square(4);
		System.out.println(sq2); // invoke sq2.toString()
		// Square[Rectangle[Shape[color=red,filled=true],width=4.0,length=4.0]

		Square sq3 = new Square(7, "purple", true);
		System.out.println(sq3); // invoke sq3.toString()
		// Square[Rectangle[Shape[color=purple,filled=true],width=7.0,length=7.0]

		// Test getter and setter methods of Square object
		System.out.println();

		System.out.println(sq3.getSide());
		sq3.setSide(12);
		System.out.println(sq3.getSide());
		// 12.0
		System.out.println(sq3.getWidth());
		// 12.0
		System.out.println(sq3.getLength());
		// 12.0

		// Test area() and perimeter() methods
		System.out.println();

		// (1) Circle
		System.out.println(c3.getArea());
		System.out.println(c3.getPerimeter());

		// (2) Rectangle
		System.out.println(r3.getArea());
		System.out.println(r3.getPerimeter());

		// (3) Square
		System.out.println(sq3.getArea());
		// 144.0
		System.out.println(sq3.getPerimeter());
		// 48.0
	}
}
