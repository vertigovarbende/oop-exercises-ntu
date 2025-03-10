package comp_vs_inh;

import static java.lang.Math.*;

public class LineSub extends Point {

	// The sub class of Point
	// "A line is a point extended by another point"

	// "Use composition if possible, before considering inheritance. Use inheritance
	// only if there is a clear hierarchical relationship between classes."

	// The private instance variable
	private Point end;

	// Constructors

	// +LineSub(x1: int, y1: int, x2: int, y2: int)
	public LineSub(int x1, int y1, int x2, int y2) {
		super(x1, y1);
		this.end = new Point(x2, y2);
	}

	// +LineSub(begin: Point, end: Point)
	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}

	// Getter and Setter methods

	// Getter method for 'begin'
	public Point getBegin() {
		return this; // ??
	}

	// Setter method for 'begin'
	public void setBegin(Point begin) {
		super.setX(begin.getX());
		super.setY(begin.getY());
	}

	// Getter method for private instance variable 'end'
	public Point getEnd() {
		return end;
	}

	// Setter method for private instance variable 'end'
	public void setEnd(Point end) {
		this.end = end;
	}

	// Others Getter and Setter methods

	public int getBeginX() {
		return getX(); // super.getX()
	}

	public void setBeginX(int x) {
		setX(x); // super.setX(x)
	}

	public int getBeginY() {
		return getY(); // super.getY()
	}

	public void setBeginY(int y) {
		setY(y); // super.setY(y);
	}

	public int[] getBeginXY() {
		return getXY(); // super.getXY();
//		return new int[] { getX(), getY() };
	}

	public void setBeginXY(int x, int y) {
		setXY(x, y); // super.setXY(x, y);
	}

	public int getEndX() {
		return end.getX();
	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public int getEndY() {
		return end.getY();
	}

	public void setEndY(int y) {
		end.setY(y);
	}

	public int[] getEndXY() {
		return end.getXY();
	}

	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}

	// toString()
	@Override
	public String toString() {
		return String.format("LineSub[begin=%s,end=%s]", super.toString(), end.toString());
	}

	// +getLength(): double
	// this method calculates and returns the length of the line
//	public double getLength() {
//		return sqrt(pow(end.getY() - getY(), 2) + pow(end.getX() - getX(), 2));
//	}

	// +getLength(): double
	// this method calculates and returns the length of the line
	public double getLength() {
		return super.distance(end);
	}
}