package basics.point;

public class PointTest {
	public static void main(String[] args) {

		// Test constructors and toString()

		// Smart constructor
		Point myPoint = new Point(3, 4);
		System.out.println(myPoint); // myPoint.toString()
		// (3,4)

		// Default constructor
		Point anotherPoint = new Point();
		System.out.println(anotherPoint);
		// (0,0)

		// Test Setters and Getters

		myPoint.setX(6);
		myPoint.setY(8);
		System.out.println(myPoint); // myPoint.toString()
		// (6,8)

		System.out.println("x: " + myPoint.getX()); // x: 6
		System.out.println("y: " + myPoint.getY()); // y: 8

		// Test setXY() and getXY()

		myPoint.setXY(5, 6);
		System.out.println(myPoint); // myPoint.toString()
		// (5, 6)
		System.out.println("x: " + myPoint.getXY()[0]); // x: 5
		System.out.println("y: " + myPoint.getXY()[1]); // y: 6

		// Test the 3 overloaded versions of distance()

		anotherPoint.setXY(10, 11);

		System.out.format("Distance is: %.2f\n", myPoint.distance(10, 11)); // Distance is: 7.07
		System.out.format("Distance is: %.2f\n", myPoint.distance(anotherPoint)); // Distance is: 7.07
		System.out.format("Distance is: %.2f\n", anotherPoint.distance(myPoint)); // Distance is: 7.07
		System.out.format("Distance is: %.2f\n", myPoint.distance()); // Distance is: 7.81

	}
}
