package ch05_polymorphism;

public class Triangle extends Shape {

	// The private instance variables
	private int base;
	private int heigth;

	// Constructor
	// +Triangle(color: String, base: int, heigth: int)
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.heigth = height;
	}

	@Override
	public double getArea() {
		return 0.5 * base * heigth;
	}

	@Override
	public String toString() {
		return "Triangle[base=" + base + ",heigth=" + heigth + "," + super.toString() + "]";
	}
}