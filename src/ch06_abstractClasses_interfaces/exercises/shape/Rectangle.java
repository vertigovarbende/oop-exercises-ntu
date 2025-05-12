package ch06_abstractClasses_interfaces.exercises.shape;

import static java.lang.Math.PI;

public class Rectangle extends AbstractShape {

	// The protected instance variables
	protected double width;
	protected double length;

	// Constructors

	// +Rectangle() - default constructor
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}

	// +Rectangle(width: double, length: double) - smart constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	// +Rectangle(width: double, length: double, color: String, filled: boolean) -
	// smart constructor
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	// Getter and Setter methods

	// Getter method for protected instance variable 'width'
	public double getWidth() {
		return width;
	}

	// Setter method for protected instance variable 'width'
	public void setWidth(double width) {
		this.width = width;
	}

	// Getter method for protected instance variable 'length'
	public double getLength() {
		return length;
	}

	// Setter method for protected instance variable 'length'
	public void setLength(double length) {
		this.length = length;
	}

	// toString()
	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
	}

	// getArea()
	// +getArea(): double
	// this method is implemented to calculates the area of the rectangle object
	public double getArea() {
		return width * length;
	}

	// getPerimeter()
	// +getPerimeter(): double
	// this method is implemented to calculates the perimeter of the circle object
	public double getPerimeter() {
		return (width * 2) + (length * 2);
	}

}