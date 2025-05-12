package ch05_polymorphism;

public class Shape {

	// The protected instance variable
	protected String color;

	// Constructor
	// +Shape(color: String)
	public Shape(String color) {
		this.color = color;
	}

	// +getArea(): double
	// this method calcutes and returns the area of the shape
	// all shapes must provide a method called getArea()
	public double getArea() {
		System.err.println("Shape unknown! Cannot compute area!");
		return 0;
	}

	// toString()
	public String toString() {
		return "Shape[color=" + color + "]";
	}
}