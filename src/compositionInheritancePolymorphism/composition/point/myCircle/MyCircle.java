package compositionInheritancePolymorphism.composition.point.myCircle;

import static java.lang.Math.*;

import compositionInheritancePolymorphism.composition.point.myPoint.MyPoint;

public class MyCircle {

	// The private instance variables
	private MyPoint center;
	private int radius;

	// Constructors

	// +MyCircle()
	public MyCircle() {
		center = new MyPoint();
		radius = 1;
	}

	// +MyCircle(x: int, y: int, radius: int)
	public MyCircle(int x, int y, int radius) {
		center = new MyPoint(x, y);
//		center.setX(x);
//		center.setY(y);
		this.radius = radius;
	}
	
	// +MyCircle(center: MyPoint, radius: int)
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	// Getter and Setter methods
	
	// Getter method for private instance variable 'center'
	public MyPoint getCenter() {
		return center;
	}

	// Setter method for private instance variable 'center'
	public void setCenter(MyPoint center) {
		this.center = center;
	}

	// Getter method for private instance variable 'radius'
	public int getRadius() {
		return radius;
	}

	// Setter method for private instance variable 'radius'
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		center.setY(y);
	}
	
	public int[] getCenterXY() {
		return new int[] {center.getX(), center.getY()};
	}
	
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	
	// toString() method
	public String toString() {
		return String.format("MyCircle[radius=%d,center=%s]", radius, center);
	}
	
	// +getArea(): double
	// It calculates and returns the area of this 'circle'
	public double getArea() {
		return PI * pow(radius, 2);
	}
	
	// +getCircumference(): double
	// It calculates and returns the circumference of this 'circle'
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
	// +distance(another: MyCircle): double
	// It calculates and returns the distance between two MyCircle instance
	public double distance(MyCircle another) {
		return center.distance(another.center);
	}
	
}
