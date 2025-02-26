package inheritance.exercises.cylinder;

public class Cylinder extends Circle {

	// The protected instance variable
	private double height;

	// Constructors

	// +Cylinder() - default constructor
	public Cylinder() {
		super();
		height = 1.0;
	}

	// +Cylinder(radius: double)
	public Cylinder(double radius) {
		super(radius);
		this.height = 1.0;
		// or
//		this(radius, 1.0);
	}

	// +Cylinder(radius: double, height: double)
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	// +Cylinder(radius: double, height: double, color: String)
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'height'
	public double getHeight() {
		return height;
	}

	// Setter method for private instance variable 'height'
	public void setHeight(double height) {
		this.height = height;
	}

	// +getVolume(): double
	// this method calculates the volume of the cylinder
	public double getVolume() {
		return super.getArea() * height;
	}

	// toString()
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}
}