package ch06_abstractClasses_interfaces.exercises.shape;

import static java.lang.Math.*;

public class Circle extends AbstractShape {

	// The protected instance variable
	protected double radius;

	// Constructors

	// +Circle() - default constructor
	public Circle() {
		radius = 1.0;
	}

	// +Circle(radius: double) - smart constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// +Circle(radius: double, color: String, filled: boolean) - smart constructor
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	// Getter and Setter methods

	// Getter method for protected instance variable 'radius'
	public double getRadius() {
		return radius;
	}

	// Setter method for protected instance variable 'radius'
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// toString()
	@Override
	public String toString() {
		return "Circle[" + super.toString() + ",radius=" + radius + "]";
	}

	// getArea()
	// +getArea(): double
	// this method is implemented to calculates the area of the circle object
	public double getArea() {
		return PI * pow(radius, 2);
	}

	// getPerimeter()
	// +getPerimeter(): double
	// this method is implemented to calculates the perimeter of the circle object
	public double getPerimeter() {
		return 2 * PI * radius;
	}

}