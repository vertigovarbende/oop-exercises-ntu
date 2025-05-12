package ch02_composition.point.myCircle;

import ch02_composition.point.myPoint.MyPoint;

public class TestMyCircle {

	public static void main(String[] args) {
		
		// Test Constructors and toString

		MyCircle defaultCircle = new MyCircle();
		System.out.println(defaultCircle);
		// MyCircle[radius=1,center=(0,0)]
		MyCircle myCircle1 = new MyCircle(3, 4, 2);
		System.out.println(myCircle1);
		// MyCircle[radius=2,center=(3, 4)]
		MyCircle myCircle2 = new MyCircle(new MyPoint(5, 6), 4);
		System.out.println(myCircle2);
		// MyCircle[radius=4,center=(5,6)]
		
		
		// Test Getter and Setter
	}

}
