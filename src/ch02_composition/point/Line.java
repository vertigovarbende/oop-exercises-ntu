package ch02_composition.point;

import static java.lang.Math.*;

public class Line {

	// The private instance variables
	// These instance variable are an Point instance
	// And we say that "A line is composed of two points"
	// Composition exhibits a "has-a" relationship
	private Point begin;
	private Point end;

	// Constructors

	// +Line(x1:int, y1:int, x2:int, y2:int)
	public Line(int x1, int y1, int x2, int y2) {
		begin = new Point(x1, y1);
		end = new Point(x2, y2);
	}

	// +Line(begin:Point, end:Point)
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}

	// Setter and Getter methods

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX(); // Point's getX()
	}

	public void setBeginX(int x) {
		begin.setX(x); // Point's setX()
	}

	public int getBeginY() {
		return begin.getY(); // Point's getY()
	}

	public void setBeginY(int y) {
		begin.setY(y); // Point's setY()
	}

	public int[] getBeginXY() {
		return begin.getXY(); // Point'ss getXY()
	}

	public void setBeginXY(int x, int y) {
		begin.setXY(x, y); // Point's setXY()
	}

	public int getEndX() {
		return end.getX(); // Point's getX()
	}

	public void setEndX(int x) {
		end.setX(x); // Point's setX()
	}

	public int getEndY() {
		return end.getY(); // Point's getY()
	}

	public void setEndY(int y) {
		end.setY(y); // Point's setY()
	}

	public int[] getEndXY() {
		return end.getXY(); // Point's getXY()
	}

	public void setEndXY(int x, int y) {
		end.setXY(x, y); // Point's setXY()
	}

	// toString method
	public String toString() {
		return "Line[begin=" + begin + ",end=" + end + "]";
	}

	// getLength():double
	// This method calculates the length of the Line
	public double getLength() {
		// end.distance(begin)
		return begin.distance(end);
	}
	
	// +getGradient():double
	// This method returns the gradient of 'this' line in radian
	public double getGradient() {
		return atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
	}
	
	// distance methods
	// distance methods calculates and returns the distance from 'this' line to the given point 
	
	// +distance(x: int, y: int):double 
	public double distance(int x, int y) {
		return 0.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
