package ch02_composition.circle;

import static java.lang.Math.*;

import ch02_composition.point.*;

public class Circle {

	// The private instance variables
	private Point center;
	private double radius;

	// Constructors

	// +Circle() - default constructor
	public Circle() {
		center = new Point();
		radius = 1.0;
	}

	// +Circle(xCenter:int, yCenter:int, radius:double)
	public Circle(int xCenter, int yCenter, double radius) {
		center = new Point(xCenter, yCenter);
		this.radius = radius;
	}

	// +Circle(center:Point, radius:double)
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'center'
	public Point getCenter() {
		return center;
	}

	// Setter method for private instance variable 'center'
	public void setCenter(Point center) {
		this.center = center;
	}

	// Getter method for private instance variable 'radius'
	public double getRadius() {
		return radius;
	}

	// Setter method for private instance variable 'radius'
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// +getCenterX():int
	// Getter method for apsis(x) of the center
	public int getCenterX() {
		return center.getX();
	}

	// +setCenterX(x:int):void
	// Setter method for apsis(x) of the center
	public void setCenterX(int x) {
		center.setX(x);
	}

	// +getCenterY():int
	// Getter method for ordinate(y) of the center
	public int getCenterY() {
		return center.getY();
	}

	// +setCenterY():int
	// Setter method for ordinate(y) of the center
	public void setCenterY(int y) {
		center.setY(y);
	}

	// +getCenterXY():int[2]
	// This method returns apsis(x) and ordinate(y) of the center as an array of
	// integers.
	public int[] getCenterXY() {
		return center.getXY();
	}

	// +setCenterXY(x:int, y:int):void
	// This method sets apsis(x) and ordinate(y) of the center given arguments
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}

	// toString method
	public String toString() {
		return String.format("Circle[center=(%d,%d), radius=%.2f", center.getX(), center.getY(), radius);
	}

	// +getArea():double
	// This method returns the area of the circle
	public double getArea() {
		return PI * pow(radius, 2);
	}
	
	// +getCircumference():double
	// This method returns the circumference of the circle
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
	// +distance(another:Circle):double
	// This method calculates and returns the distance between this Circle object and another Circle object
	public double distance(Circle another) {
		return center.distance(another.center);
	}
}
