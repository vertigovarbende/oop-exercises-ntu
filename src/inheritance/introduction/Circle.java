package inheritance.introduction;

import static java.lang.Math.*;

public class Circle {

	// The private instance variables
	private double radius;
	private String color;
	
	// Constructor
	
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
	
	// Getter method for private instance variable 'radius'
	public double getRadius() {
		return radius;
	}
	
	// Setter method for private instance variable 'radius'
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Getter method for private instance variable 'color'
	public String getColor() {
		return color;
	}
	
	// Setter method for private instance variable 'color'
	public void setColor(String color) {
		this.color = color;
	}
	
	// +toString(): String
	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}
	
	// +getArea(): double
	// it returns the area of the circle
	public double getArea() {
		return PI * pow(radius, 2);
	}
}
