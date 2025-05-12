package ch02_composition.point.myTriangle;

import ch02_composition.point.myPoint.MyPoint;

public class MyTriangle {

	// The private instance variables
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	// Constructors

	// +MyTriangle(x1: int, y1: int, x2: int, y2: int, x3: int, y3: int)
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1 = new MyPoint(x1, y1);
		v2 = new MyPoint(x2, y2);
		v3 = new MyPoint(x3, y3);
	}

	// +MyTriangle(v1: MyPoint, v2: MyPoint, v3: MyPoint)
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	// +toString()
	public String toString() {
		return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]", v1, v2, v3);
	}

	// +getPerimeter(): double
	// it computes and returns the perimeter of the triangle
	public double getPerimeter() {
		return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
	}

	// +getType(): String
	// it checks the triangle type
	// if all the three sides are equal, prints "equilateral"
	// if any two of the three sides are equals, prints "isosceles"
	// if the three sides are different, prints "scalene"
	public String getType() {
		if (v1.distance(v2) == v1.distance(v3) && v1.distance(v2) == v2.distance(v3))
			return "equilateral";
		else if (v1.distance(v2) == v1.distance(v3) || v2.distance(v3) == v1.distance(v3)
				|| v1.distance(v2) == v2.distance(v3))
			return "isosceles";
		else
			return "scalene";
	}
}
