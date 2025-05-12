package ch02_composition.point.myPoint;

public class TestMyPoint {

	public static void main(String[] args) {

		// (1) Test constructors and toString()
		MyPoint p1 = new MyPoint();
		System.out.println(p1); // invoke the toString()
		// (0,0)
		MyPoint p2 = new MyPoint(3, 4);
		System.out.println(p2); // invoke the toString()
		// (3, 4)

		System.out.println();

		// (2) Test Getter and Setter methods

		System.out.println(p2.getX());
		// 3
		System.out.println(p2.getY());
		// 4
		System.out.println(p2.getXY()[0]);
		// 3
		System.out.println(p2.getXY()[1]);
		// 4
		p1.setX(5);
		System.out.println(p1.getX());
		// 5
		p1.setY(6);
		System.out.println(p1.getY());
		// 6
		p2.setXY(3, 4);
		System.out.println(p2);
		// (3, 4)

		// (3) Test overloaded distance methods

		System.out.println(p2.distance(5, 6));
		// 2.82
		System.out.println(p2.distance(p1));
		// 2.82
		System.out.println(p2.distance());
		// 5

		// (4) Write a program that allocates 10 points in an array of MyPoint, and
		// initializes to (1, 1), (2, 2), ... (10, 10)
		System.out.println();
		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < points.length; ++i) {
			points[i] = new MyPoint(i + 1, i + 1);
		}

		for (MyPoint a : points)
			System.out.println(a);

	}
}
