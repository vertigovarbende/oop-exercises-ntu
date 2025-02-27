package inheritance.exercises.point3D;

public class Point3D extends Point2D {

	// The private instance variables
	private float z;

	// Point3D() - default constructor
	public Point3D() {
		super();
		z = 0.0f;
	}

	// Point3D(x: float, y: float, z: float)
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'z'
	public float getZ() {
		return z;
	}

	// Setter method for private instance variable 'z'
	public void setZ(float z) {
		this.z = z;
	}

	// +getXYZ(): float[3]
	public float[] getXYZ() {
		return new float[] { x, y, z };
	}

	// +setXYZ(x: float, y: float, z: float): void
	public void setXYZ(float x, float y, float z) {
//		this.x = x;
//		this.y = y;
		setX(x);
		setY(y);
		this.z = z;
	}

	// toString()
	@Override
	public String toString() {
		return String.format("(%.1f,%.1f,%.1f)", x, y, z);
	}
}