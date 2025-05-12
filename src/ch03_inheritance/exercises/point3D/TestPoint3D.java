package ch03_inheritance.exercises.point3D;

public class TestPoint3D {

	public static void main(String[] args) {

		// Test constructor and toString()

		Point3D p3d = new Point3D();
		System.out.println(p3d); // invoke p3d.toString()
		// (0,0,0,0,0,0)

		Point3D p3d2 = new Point3D(1.2f, 3.1f, 3.4f);
		System.out.println(p3d2); // invoke p3d2.toString()
		// (1,2,3,1,3,4)

		// Test getter and setter

		p3d.setX(1);
		System.out.println(p3d);
		// (1,0,0,0,0,0)
		p3d.setY(2);
		System.out.println(p3d);
		// (1,0,2,0,0,0)
		p3d.setZ(3);
		System.out.println(p3d);
		// (1,0,2,0,3,0)
		p3d.setXYZ(2, 3, 4);
		System.out.println(p3d);
		// (2,0,3,0,4,0)
		
		System.out.println("x: " + p3d.getX()
				+ " y: " + p3d.getY()
				+ " z: " + p3d.getZ()
				+ " (x,y,z): (" + p3d.getXYZ()[0] + "," + p3d.getXYZ()[1] + "," + p3d.getXYZ()[2] + ")");
	}

}