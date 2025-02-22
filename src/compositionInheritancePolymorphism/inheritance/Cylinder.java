package compositionInheritancePolymorphism.inheritance;

import static java.lang.Math.*;

// Cylinder class is a subclass and it inherits Circle class
public class Cylinder extends Circle {

	// The private instance variables
	private double height;

	// Constructor

	// +Cylinder() - default constructor
	public Cylinder() {
		super();
		height = 1.0;
	}

	// +Cylinder(height: double)
	public Cylinder(double height) {
		super();
		this.height = height;
	}

	// +Cylinder(height: double, radius: double)
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}

	// +Cylinder(height: double, radius: double, color: String)
	public Cylinder(double height, double radius, String color) {
		super(height, color);
		this.height = height;
	}

	// Getter and Setter methods for private instance variables

	// Getter method for private instance variable 'height'
	public double getHeight() {
		return height;
	}

	// Setter method for private instance variable 'height'
	public void setHeight(double height) {
		this.height = height;
	}

	// +toString(): String
	@Override
	public String toString() {
		return "Cylinder[" + super.toString() + ",height=" + height + "]";
	}

	// +getArea(): double
	// Override the getArea() method inherited from superclass 'Circle'
	@Override
	public double getArea() {
		return 2 * PI * getRadius() * height + 2 * super.getArea();
	}

	// +getVolume(): double
	// it returns the volume of the cylinder
	public double getVolume() {
		return super.getArea() * height; // in here we used superclass' getArea()
	}
}
