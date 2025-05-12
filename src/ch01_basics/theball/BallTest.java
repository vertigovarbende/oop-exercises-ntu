package ch01_basics.theball;

import java.util.Arrays;

public class BallTest {
	public static void main(String[] args) {
		// Test constructor and toString()
		
		Ball myBall = new Ball(1, 2, 11, 12);
		System.out.println(myBall); // toString()
		// Ball@(1.0, 2.0), speed = (11.0, 12.0)
		
		// Test Setters and Getter
		
		myBall.setX(3);
		myBall.setY(4);
		myBall.setXStep(13);
		myBall.setYStep(14);
		System.out.println(myBall);
		// Ball@(1.0, 2.0), speed = (11.0, 12.0)
		
		System.out.println("x is: " + myBall.getX());
		// x is: 3.0
		System.out.println("y is: " + myBall.getY());
		// y is: 4.0
		System.out.println("xStep is: " + myBall.getXStep());
		// xStep is: 13.0
		System.out.println("yStep is: " + myBall.getYStep());
		// yStep is: 14.0
		
		// Test setXY(), getXY(), setXYStep(), getXYStep()
		
		myBall.setXY(5, 6);
		myBall.setXYStep(15, 16);
		System.out.println(myBall); // toString()
		// Ball@(5.0, 6.0), speed = (15.0, 16.0)
		System.out.println("x and y are: " + Arrays.toString(myBall.getXY()));
		// x and y are: [5.0, 6.0]
		System.out.println("xStep and yStep are: " + Arrays.toString(myBall.getXYStep()));
		// xStep and yStep are: [15.0, 16.0]
		
		// Test move() and chaining
		System.out.println(myBall.move()); // toString()
		// Ball@(20.0, 22.0), speed = (15.0, 16.0)
		System.out.println(myBall.move().move().move());
		// Ball@(65.0, 70.0), speed = (15.0, 16.0)
		
		
	}
}
