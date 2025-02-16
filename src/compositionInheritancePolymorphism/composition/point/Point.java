package compositionInheritancePolymorphism.composition.point;

import static java.lang.Math.*;

public class Point {

	// The private instance variables
	private int x;
	private int y;

	// Constructors

	// default constructor
	// +Point()
	public Point() {
		x = 0;
		y = 0;
	}

	// smart constructor
	// +Point(x:int, y:int)
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

	// toString()
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}

	// + getXY():int[2]
	// getXY() method returns a 2-element int array of this instance's x & and y
	// variables /{x, y}
	public int[] getXY() {
		return new int[] { x, y };
	}

	// +setXY(x:int, y:int):void
	// setXY() method assigns new values to x and y variables
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// overloaded distance methods
	// distance methods calculate the distance between 2 points

	// +distance(x:int, y:int): double
	public double distance(int x, int y) {
		return sqrt(pow(x - this.x, 2) + pow(y - this.y, 2));
	}

	// +distance(another:Point):double
	public double distance(Point another) {
		return sqrt(pow(another.x - this.x, 2) + pow(another.y - this.y, 2));
	}
	
	// +distance():double
	// this distance returns the distance from 'this' to (0, 0)
	public double distance() {
		return sqrt(pow(this.x, 2) + pow(this.y, 2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
