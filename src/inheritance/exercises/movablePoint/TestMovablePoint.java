package inheritance.exercises.movablePoint;

public class TestMovablePoint {

	public static void main(String[] args) {

		// Test Constructors and toString()
		MovablePoint mPoint = new MovablePoint();
		System.out.println(mPoint); // invoke mPoint.toString()
		// (0.0, 0.0),speed=(0,0, 0,0)

		MovablePoint mPoint2 = new MovablePoint(2, 3);
		System.out.println(mPoint2); // invoke mPoint2.toString()
		// (0.0, 0.0),speed=(0,0, 2,0, 3, 0)

		MovablePoint mPoint3 = new MovablePoint(3, 4, 2, 1);
		System.out.println(mPoint3); // invoke mPoint3.toString()
		// (3.0, 4.0),speed=(2,0, 1,0)
		
		// Test getter and setter methods
		
		mPoint.setX(1);
		System.out.println(mPoint);
		// (1.0, 0.0),speed=(0,0, 0,0)

		mPoint.setY(2);
		System.out.println(mPoint);
		// (1.0, 2.0),speed=(0,0, 0,0)
		
		mPoint.setXSpeed(4);
		System.out.println(mPoint);
		// (1.0, 2.0),speed=(4,0, 0,0)
		
		mPoint.setYSpeed(5);
		System.out.println(mPoint);
		// (1.0, 2.0),speed=(4,0, 5,0)
		
		mPoint.setSpeed(6, 7);
		System.out.println(mPoint);
		// (1.0, 2.0),speed=(6,0, 7,0)
		
		System.out.println("x: " + mPoint.getX()
				+ " y: " + mPoint.getY()
				+ " xSpeed: " + mPoint.getXSpeed()
				+ " ySpeed: " + mPoint.getYSpeed());
		
		// test move() 
		System.out.println(mPoint.move().move().move());
		// (19.0, 23.0),speed=(6,0, 7,0)
		System.out.println(mPoint2.move());
		// (2,0, 3,0),speed=(2,0, 3,0)
		System.out.println(mPoint3.move());
		// (5.0, 5.0),speed=(2,0, 1,0)
	}
}