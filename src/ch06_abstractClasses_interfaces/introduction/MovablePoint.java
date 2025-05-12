package ch06_abstractClasses_interfaces.introduction;

public class MovablePoint implements Movable {

	// The private instance variables
	private int x;
	private int y;

	// Constructor
	// +MovablePoint(x: int, y: int)
	public MovablePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveUp() {
		--y;
	}

	@Override
	public void moveDown() {
		++y;
	}

	@Override
	public void moveLeft() {
		--x;
	}

	@Override
	public void moveRight() {
		++x;
	}

	// toString()
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}