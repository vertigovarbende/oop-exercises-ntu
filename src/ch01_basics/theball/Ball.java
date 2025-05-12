package ch01_basics.theball;

public class Ball {

	// The private instance variables
	private double x;
	private double y;
	private double xStep;
	private double yStep;

	// Constructor
	// Ball(x:double, y:double, xStep:double, yStep:double)
	public Ball(double x, double y, double xStep, double yStep) {
		this.x = x;
		this.y = y;
		this.xStep = xStep;
		this.yStep = yStep;
	}

	// Getters and Setters methods

	// Getter method for private instance variable x
	public double getX() {
		return x;
	}

	// Setter method for private instance variable x
	public void setX(double x) {
		this.x = x;
	}

	// Getter method for private instance variable y
	public double getY() {
		return y;
	}

	// Setter method for private instance variable y
	public void setY(double y) {
		this.y = y;
	}

	// Getter method for private instance variable xStep
	public double getXStep() {
		return xStep;
	}

	// Setter method for private instance variable xStep
	public void setXStep(double xStep) {
		this.xStep = xStep;
	}

	// Getter method for private instance variable yStep
	public double getYStep() {
		return yStep;
	}

	// Setter method for private instance variable yStep
	public void setYStep(double yStep) {
		this.yStep = yStep;
	}

	// toString()
	public String toString() {
		return String.format("Ball@(%.1f, %.1f), Speed(%.1f, %.1f)", x, y, xStep, yStep);
	}

	// +getXY():double[2]
	public double[] getXY() {
		return new double[] { x, y };
	}

	// +setXY(x:double, y:double):void
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// +getXYStep():double[2]
	public double[] getXYStep() {
		return new double[] { xStep, yStep };
	}
	
	// +setXYStep(xStep:double, yStep:double):void
	public void setXYStep(double xStep, double yStep) {
		this.xStep = xStep;
		this.yStep = yStep;
	}
	
	// +move():Ball
	public Ball move() {
		x += xStep;
		y += yStep;
		return this;
	}
	
	

}
