package ch03_inheritance.exercises.shape;

public class Rectangle extends Shape {

	// The protected instance variables
	protected double width;
	protected double length;

	// Constructors

	// +Rectangle() - default constructor
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}

	// +Rectangle(width: double, length: double)
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	// +Rectangle(width: double, length: double, color: String, filled: boolean)
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	// Getter and Setter methods

	// Getter method for instance variable 'width'
	public double getWidth() {
		return width;
	}

	// Setter method for instance variable 'width'
	public void setWidth(double width) {
		this.width = width;
	}

	// Getter method for instance variable 'length'
	public double getLength() {
		return length;
	}

	// Setter method for instance variable 'length'
	public void setLength(double length) {
		this.length = length;
	}

	// +getArea(): double
	// this method calculates and returns the area of the 'this' rectangle
	public double getArea() {
		return width * length;
	}

	// +getPerimeter(): double
	// this method calculates and returns the perimeter of the 'this' rectangle
	public double getPerimeter() {
		return (2 * width) + (2 * length);
	}

	// toString()
	@Override
	public String toString() {
		return String.format("Rectangle[%s,width=%.1f,length=%.1f", super.toString(), width, length);
	}
}