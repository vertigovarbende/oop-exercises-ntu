package ch03_inheritance.exercises.point3D;

public class Point2D {

	// The protected instance variables
	protected float x;
	protected float y;

	// Constructors

	// +Point2D() - default constructor
	public Point2D() {
		x = 0.0f;
		y = 0.0f;
	}

	// +Point2D(x: float, y: float)
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	// Getter and Setter methods

	// Getter method for instance variable 'x'
	public float getX() {
		return x;
	}

	// Setter method for instance variable 'x'
	public void setX(float x) {
		this.x = x;
	}

	// Getter method for instance variable 'y'
	public float getY() {
		return y;
	}

	// Setter method for instance variable 'y'
	public void setY(float y) {
		this.y = y;
	}

	// +getXY(): float[2]
	// this method returns float array of point's x and y
	public float[] getXY() {
		return new float[] { x, y };
	}

	// +setXY(x: float, y: float): void
	// this method sets both x and y
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	// toString()
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}