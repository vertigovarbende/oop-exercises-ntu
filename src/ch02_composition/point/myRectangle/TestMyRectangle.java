package ch02_composition.point.myRectangle;

import ch02_composition.point.myPoint.MyPoint;

public class TestMyRectangle {

	public static void main(String[] args) {
		// Test Constructors and toString()
		
		// (1) Constructor
		MyRectangle r1 = new MyRectangle(0, 4, 6, 0);
		System.out.println(r1.toString()); // invoke toString()
		
		// (2) Constructor
		MyPoint t_l = new MyPoint(2, 12);
		MyPoint b_r = new MyPoint(4, 2);
		
		MyRectangle r2 = new MyRectangle(t_l, b_r);
		System.out.println(r2); // invoke toString()
		
		// Test getPerimeter() 
		System.out.println(r1.getPerimeter()); // 20
		System.out.println(r2.getPerimeter()); // 22
		
		// Test getArea()
		System.out.println(r1.getArea()); // 24
		System.out.println(r2.getArea()); // 20
		
	}
}
