package inheritance.exercises.shape;

import static java.lang.Math.*;

public class Circle extends Shape {

	// The private instance variable
	private double radius;

	// Constructors

	// +Circle() - default constructor
	public Circle() {
		super();
		radius = 1.0;
	}

	// +Circle(radius: double)
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// +Circle(radius: double, color: String, filled: boolean)
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'radius'
	public double getRadius() {
		return radius;
	}

	// Setter method for private instance variable 'radius'
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// +getArea(): double
	// this method calculates and returns the area of the 'this' circle
	public double getArea() {
		return PI * pow(radius, 2);
	}

	// +getPerimeter(): double
	// this method calculate and returns the perimeter of the 'this' circle
	public double getPerimeter() {
		return 2 * PI * radius;
	}

	// toString()
	@Override
	public String toString() {
		return String.format("Circle[%s,radius=%.2f", super.toString(), radius);
	}
}