package composition.point.myLine;

import composition.point.myPoint.MyPoint;

public class TestMyLine {

	public static void main(String[] args) {
		// Test constructors and toString()
		
		MyLine myLine1 = new MyLine(1, 2, 3, 4);
		System.out.println(myLine1);
		// MyLine[begin=(1,2),end=(3,4)]
		
		MyLine myLine2 = new MyLine(new MyPoint(2, 3), new MyPoint(4, 5));
		System.out.println(myLine2);
		// MyLine[begin=(2,3),end=(4,5)]
		
		// Test Getters and Setters
		
		myLine2.setBegin(new MyPoint(3, 4));
		myLine2.setEnd(new MyPoint(6, 7));
		System.out.println(myLine2);
		// MyLine[begin=(3,4),end=(6,7)]
		
		myLine2.setBeginXY(4, 5);
		myLine2.setEndXY(7, 8);
		System.out.println(myLine2);
		// MyLine[begin=(4,5),end=(7,8)]
		
		System.out.println(myLine2.getBegin());
		// (4,5)
		System.out.println(myLine2.getEnd());
		// (7,8)
		System.out.println(myLine2.getBeginX());
		// 4
		System.out.println(myLine2.getBeginY());
		// 5
		System.out.println(myLine2.getEndX());
		// 7
		System.out.println(myLine2.getEndY());
		// 8
		
		// Test getLength()
		System.out.println(myLine2.getLength());
		
		// Test getGradient()
		System.out.println(myLine2.getGradient());
		
		
	}

}
