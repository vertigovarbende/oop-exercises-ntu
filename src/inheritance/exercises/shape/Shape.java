package inheritance.exercises.shape;

public class Shape {

	// The protected instance variables
	protected String color;
	protected boolean filled;

	// Constructors

	// +Shape() - default constructor
	public Shape() {
		color = "red";
		filled = true;
	}

	// +Shape(color: String, filled: boolean)
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Getter and Setter methods

	// Getter method for instance variable 'color'
	public String getColor() {
		return color;
	}

	// Setter method for instance variable 'color'
	public void setColor(String color) {
		this.color = color;
	}

	// Getter method for instance variable 'filled'
	public boolean isFilled() {
		return filled;
	}

	// Setter method for instance variable 'filled'
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// toString()
	public String toString() {
		return "Shape[color=" + color + ",filled=" + filled + "]";
	}
}