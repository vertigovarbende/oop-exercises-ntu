package ch02_composition.point.myLine;

import static java.lang.Math.*;

import ch02_composition.point.myPoint.MyPoint;

public class MyLine {

	// The private instance variables
	private MyPoint begin;
	private MyPoint end;
	
	// Constructors
	
	// +MyLine(x1: int, y1: int, x2: int, y2: int)
	public MyLine(int x1, int y1, int x2, int y2) {
		begin = new MyPoint(x1, y1);
		end = new MyPoint(x2, y2);
	}
	
	// +MyLine(begin: MyPoint, end: MyPoint)
	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}

	// Getter and Setter methods
	
	// Getter method for private instance variable 'begin'
	public MyPoint getBegin() {
		return begin;
	}

	// Setter method for private instance variable 'begin'
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}

	// Getter method for private instance variable 'end'
	public MyPoint getEnd() {
		return end;
	}
	
	// Setter method for private instance variable 'end'
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	// Getter method for variable 'x' of instance 'begin' 
	public int getBeginX() {
		return begin.getX();
	}
	
	// Setter method for variable 'x' of instance 'begin'
	public void setBeginX(int x) {
		begin.setX(x);
	}
	
	// Getter method for variable 'y' of instance 'begin'
	public int getBeginY() {
		return begin.getY();
	}
	
	// Setter method for variable 'y' of instance 'begin'
	public void setBeginY(int y) {
		begin.setY(y);
	}
	
	// Getter method for variable 'x' of instance 'end'
	public int getEndX() {
		return end.getX();
	}
	
	// Setter method for variable 'x' of instance 'end'
	public void setEndX(int x) {
		end.setX(x);
	}
	
	// Getter method for variable 'y' of instance 'end'
	public int getEndY() {
		return end.getY();
	}
	
	// Setter method for variable 'y' of instance 'end'
	public void setEndY(int y) {
		end.setY(y);
	}
	
	// +getBeginXY(): int[2]
	// This method returns begin's apsis(x) and ordinate(y) variables in a 2-element int[2] array
	public int[] getBeginXY() {
		return begin.getXY();
	}
	
	// +setBeginXY(x: int, y: int): void
	// This method sets begin's apsis(x) and ordinate(y) variables
	public void setBeginXY(int x, int y) {
		begin.setXY(x, y);
	}
	
	// +getEndXY(): int[2]
	// This method returns begin'ss apsis(x) and ordinate(y) variabless in a 2-element int[2] array
	public int[] getEndXY() {
		return end.getXY();
	}
	
	// +setEndXY(x: int, y: int): void
	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}
	
	// Other methods
	
	// +getLength(): double
	// This method calculates and returns the length of the MyLine instance
	public double getLength() {
		return end.distance(begin);
		// or
// 		return begin.distance(end);
//		return sqrt(pow(end.getX() - begin.getX(), 2) + pow(end.getY() - begin.getY(), 2));
	}
	
	// +getGradient(): double
	// This method calculates and returns the gradient of the MyLine instance
	public double getGradient() {
		return atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
	}
	
	// toString() method
	public String toString() {
		return String.format("MyLine[begin=%s,end=%s]", begin, end);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
