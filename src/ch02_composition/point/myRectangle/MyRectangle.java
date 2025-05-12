package ch02_composition.point.myRectangle;

import static java.lang.Math.*;

import ch02_composition.point.myPoint.MyPoint;

public class MyRectangle {

	// The private instance variables
	private MyPoint top_left;
	private MyPoint bottom_right;

	// Constructors

	// +MyRectangle(x1: int, y1: int, x2: int, y2: int)
	public MyRectangle(int x1, int y1, int x2, int y2) {
		top_left = new MyPoint(x1, y1);
		bottom_right = new MyPoint(x2, y2);
	}

	// +MyRectangle(top_left: MyPoint, bottom_right: MyPoint)
	public MyRectangle(MyPoint top_left, MyPoint bottom_right) {
		this.top_left = top_left;
		this.bottom_right = bottom_right;
	}

	// toString()
	public String toString() {
		return String.format("MyRectangle[top_left=%s,bottom_right=%s]", top_left, bottom_right);
	}

	// +getPerimeter(): double
	// it computes and returns the perimeter of the rectangle
	public double getPerimeter() {
		return 2 * (top_left.distance(new MyPoint(top_left.getX(), bottom_right.getY())) + bottom_right.distance(top_left.getX(), bottom_right.getY()));
	}

	// +getArea(): double
	// it computes and returns the area of the rectangle
	public double getArea() {
		return top_left.distance(new MyPoint(top_left.getX(), bottom_right.getY())) * bottom_right.distance(top_left.getX(), bottom_right.getY());
	}
}
