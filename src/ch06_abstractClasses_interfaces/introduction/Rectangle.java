package ch06_abstractClasses_interfaces.introduction;

public class Rectangle extends AbstractShape {

	// The private instance variable
	private int length;
	private int width;

	// Constructor
	// +Rectangle(color: String, length: int, width: int)
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
	}
}