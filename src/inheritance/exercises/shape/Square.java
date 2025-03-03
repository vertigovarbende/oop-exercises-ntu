package inheritance.exercises.shape;

public class Square extends Rectangle {

	// Constructors

	// +Square() - default constructor
	public Square() {
		super();
	}

	// +Square(side: double)
	public Square(double side) {
		super(side, side);
	}

	// +Square(side: double, color: String, filled: boolean)
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	// Getter and Setter methods

	public double getSide() {
		return getWidth();
//		return getLength();
	}

	public void setSide(double side) {
		setWidth(side);
//		setLength(side);
	}

	// +setWidth(side: double): void
	public void setWidth(double side) {
		this.width = side;
		super.setLength(side);
	}

	// +setLength(side: double): void
	public void setLength(double side) {
		this.length = side;
		super.setWidth(side);
	}

	// toString()
	@Override
	public String toString() {
		return String.format("Square[%s]", super.toString());
	}
}