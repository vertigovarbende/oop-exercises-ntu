package inheritance.exercises.cylinder;

import static java.lang.Math.*;

public class Circle {

	// The protected instance variables
	protected double radius;
	protected String color;

	// Constructors

	// +Circle() - default constructor
	public Circle() {
		radius = 1.0;
		color = "red";
	}

	// +Circle(radius: double)
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}

	// +Circle(radius: double, color: String)
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// Getter and Setter methods

	// Getter method for instance variable 'radius'
	public double getRadius() {
		return radius;
	}

	// Setter method for instance variable 'radius'
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Getter method for instance variable 'color'
	public String getColor() {
		return color;
	}

	// Setter method for instance variable 'color'
	public void setColor(String color) {
		this.color = color;
	}

	// +getArea(): double
	// this method calculates the area of the circle and returns
	public double getArea() {
		return PI * pow(radius, 2);
	}

	// toString()
	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}
}