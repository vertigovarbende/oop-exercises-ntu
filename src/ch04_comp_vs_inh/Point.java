package ch04_comp_vs_inh;

import static java.lang.Math.*;

public class Point {

	// The private instance variable
	private int x;
	private int y;

	// Constructors

	// default-dummy constructor
	// +Point()
	public Point() {
		x = 0;
		y = 0;
	}

	// smart constructor
	// +Point(x: int, y: int)
	public Point(int x, int y) {
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

	// +setXY(x: int, y: int): void
	// setXY() methods sets both x and y
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// +getXY(): int[2]
	// getXY() method returns the x and y in a 2-element 'int' array
	public int[] getXY() {
		return new int[] { x, y };
	}

	// toString() method
	// "(x, y)
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}

	// overloaded distance() methods

	// +distance(x: int, y: int): double
	// distance(x: int, y: int) method calculates the distance from 'this'
	// point to given point at (x, y)
	public double distance(int x, int y) {
		return sqrt(pow(this.x - x, 2) + pow(this.y - y, 2));
	}

	// +distance(another: Point): double
	// distance(another: Point) method calculates the distance from 'this'
	// point to the given instance of MyPoint
	public double distance(Point another) {
		return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
	}

	// +distance(): double
	// distance() method calculates the distance from 'this' point to (0, 0)
	// (origin)
	public double distance() {
		return sqrt(pow(this.x, 2) + pow(this.y, 2));
	}
}