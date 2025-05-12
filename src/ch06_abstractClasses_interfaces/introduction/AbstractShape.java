package ch06_abstractClasses_interfaces.introduction;

public abstract class AbstractShape {

	// protected instance variable
	protected String color;

	// Constructor
	// +Shape(color: String)
	public AbstractShape(String color) {
		this.color = color;
	}

	// toString()
	@Override
	public String toString() {
		return "Shape[color=" + color + "]";
	}

	// +getArea(): double - abstract
	public abstract double getArea();
}
