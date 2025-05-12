package ch03_inheritance.introduction;

public class Point2D {

	// The private instance variables
	private int x;
	private int y;

	// Constructors

	// +Point2D() - default constructor
	public Point2D() {
		x = 0;
		y = 0;
	}

	// +Point2D(x: int, y: int)
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'x'
	public int getX() {
		return x;
	}

	// Setter method for private instance variable 'x'
	public void setX(int x) {
		this.x = x;
	}

	// Getter method for private instance variable 'y'
	public int getY() {
		return y;
	}

	// Setter method for private instance variable 'y'
	public void setY(int y) {
		this.y = y;
	}

	// +toString()
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}
