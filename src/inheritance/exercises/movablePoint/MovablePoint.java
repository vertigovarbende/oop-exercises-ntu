package inheritance.exercises.movablePoint;

public class MovablePoint extends Point2D {

	// The private instance variables
	private float xSpeed;
	private float ySpeed;

	// Constructors

	// +MovablePoint() - default constructor
	public MovablePoint() {
		super();
		xSpeed = 0.0f;
		ySpeed = 0.0f;
	}

	// +MovablePoint(xSpeed: float, ySpeed: float)
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// +MovablePoint(x: float, y: float, xSpeed: float, ySpeed: float)
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'xSpeed'
	public float getXSpeed() {
		return xSpeed;
	}

	// Setter method for private instance variable 'xSpeed'
	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	// Getter method for private instance variable 'ySpeed'
	public float getYSpeed() {
		return ySpeed;
	}

	// Setter method for private instance variable 'ySpeed'
	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	// +getSpeed(): float[2]
	// this method returns both xSpeed and ySpeed as float array
	public float[] getSpeed() {
		return new float[] { xSpeed, ySpeed };
	}

	// +setSpeed(xSpeed: float, ySpeed: float): void
	// this method sets both xSpeed and ySpeed
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// +move(): MovablePoint
	// this method moves the point
	// ordinate will move by the value of 'ySpeed'
	// apsis will move by the value of 'xSpeed'
	public MovablePoint move() {
		setX(x + xSpeed);
		setY(y + ySpeed);
//		x += xSpeed;
//		y += ySpeed;
		return this;
	}

	// toString()
	public String toString() {
		return String.format("%s,speed=(%.1f, %.1f)", super.toString(), xSpeed, ySpeed);
	}
}