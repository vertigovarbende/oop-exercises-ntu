package inheritance.introduction;

/*
 * Point3D is a subclass of Point2D
 */

public class Point3D extends Point2D {
	
	// The private instance variable
	private int z;

	// Constructors

	// +Point3D() - default constructor
	public Point3D() {
		super();
		z = 0;
	}

	// +Point3D(x: int, y: int, z: int)
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'z'
	public int getZ() {
		return z;
	}

	// Setter method for private instance variable 'z'
	public void setZ(int z) {
		this.z = z;
	}

	// +toString()
	@Override
	public String toString() {
		return String.format("(%d,%d,%d)", getX(), getY(), z);
	}
}
