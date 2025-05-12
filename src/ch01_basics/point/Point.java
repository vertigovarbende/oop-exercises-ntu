package ch01_basics.point;

import static java.lang.Math.*;

public class Point {
	// The private instance variable
	private int x, y;

	// Constructors

	// Default constructor
	public Point() {
		x = 0;
		y = 0;
	}

	// Smart constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getters and Setters methods

	// Getter method for private variable x
	public int getX() {
		return x;
	}

	// Setter method for private variable x
	public void setX(int x) {
		this.x = x;
	}

	// Getter method for private variable y
	public int getY() {
		return y;
	}

	// Setter method for private variable y
	public void setY(int y) {
		this.y = y;
	}

	// toString method
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	// getXY method returns a 2-element integer array of {x,y}
	public int[] getXY() {
		return new int[] { x, y };
	}

	// setXY method sets the value of x and y
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Overloaded distance() methods

	// distance(x:int, y:int):double
	// Returns the distance from this instance to the given (x, y)
	public double distance(int x, int y) {
		return sqrt(pow(x - this.x, 2) + pow(y - this.y, 2));
	}

	// distance(another:Point):double
	// Returns the distance from this instance to the given Point instance another
	public double distance(Point anotherPoint) {
		return sqrt(pow(anotherPoint.x - x, 2) + pow(anotherPoint.y - y, 2));
	}
	
	// distance():double
	// Returns the distance from this to (0,0)
	public double distance() {
		return sqrt(pow(x, 2) + pow(y, 2));
	}

}
