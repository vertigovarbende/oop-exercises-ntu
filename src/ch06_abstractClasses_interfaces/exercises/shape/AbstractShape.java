package ch06_abstractClasses_interfaces.exercises.shape;

public abstract class AbstractShape {

	// The protected instance variables
	protected String color;
	protected boolean filled;

	// Constructors

	// +Shape() - default constructor
	public AbstractShape() {
		color = "Red";
		filled = true;
	}

	// +Shape(color: String, filled: boolean) - smart constructor
	public AbstractShape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Getter and Setter methods

	// Getter method for protected instance variable 'color'
	public String getColor() {
		return color;
	}

	// Setter method for protected instance variable 'color'
	public void setColor(String color) {
		this.color = color;
	}

	// Getter method for protected instance variable 'filled'
	public boolean isFilled() {
		return filled;
	}

	// Setter method for protected instance variable 'filled'
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape[color=" + color + "," + "filled=" + filled + "]";
	}

	// Abstract methods

	// getArea()
	// +abstract getArea(): double
	// this abstract method defines the signature of the getArea method which
	// calculates
	// and returns the area of the specified shape
	public abstract double getArea();

	// getPerimeter()
	// +abstract getPerimeter(): double
	// this abstract method defines the signature of the getPerimeter method which
	// calculates
	// and returns the perimeter of the specified shape
	public abstract double getPerimeter();

}
