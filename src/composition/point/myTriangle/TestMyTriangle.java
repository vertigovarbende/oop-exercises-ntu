package composition.point.myTriangle;

import static java.lang.Math.*;

import composition.point.myPoint.MyPoint;

public class TestMyTriangle {

	public static void main(String[] args) {
		// Test Constructors and toString()

		// (1) Constructor
		MyTriangle t1 = new MyTriangle(1, 3, 4, 7, 7, 3);
		System.out.println(t1); // invoke t1.toString()
		
		// (2) Constructor
		MyPoint v1 = new MyPoint(1, 2);
		MyPoint v2 = new MyPoint(3, 4);
		MyPoint v3 = new MyPoint(5, 3);
		
		MyTriangle t2 = new MyTriangle(v1, v2, v3);
		System.out.println(t2); // invoke t2.toString()
		
		// Test getPerimeter() method
		System.out.println(t1.getPerimeter());
		System.out.println(t2.getPerimeter());
		
		// Test getType() method
		
		System.out.println(t1.getType()); // isosceles
		System.out.println(t2.getType()); // scalene
	}

}
