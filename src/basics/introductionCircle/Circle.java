package basics.introductionCircle;

import static java.lang.Math.*;

public class Circle {
	// The public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";

	// private instance variables

	private double radius;
	private String color;

	// Constructors

	public Circle() { // default constructor
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}

	public Circle(double radius) { // second constructor
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}

	public Circle(double radius, String color) { // third constructor
		this.radius = radius;
		this.color = color;
	}

	// Getters & Setters

	// Getter method for private variable radius
	public double getRadius() {
		return radius;
	}

	// Setter method for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Getter method for private variable color
	public String getColor() {
		return color;
	}

	// Setter method for private variable color
	public void setColor(String color) {
		this.color = color;
	}

	// toString method
	public String toString() {
		return "Circle[" + radius + ", " + color + "]";
	}

	// Returns the area of this Circle
	public double getArea() {
		return PI * pow(radius, 2);
	}

	// Returns the circumference of this Circle
	public double getCircumference() {
		return 2 * PI * radius;
	}

}
