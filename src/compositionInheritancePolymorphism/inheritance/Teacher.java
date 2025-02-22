package compositionInheritancePolymorphism.inheritance;

/*
 * Teacher is a subclass of Person
 */
public class Teacher extends Person {

	// The private instance variables
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 30; // maximum number of courses

	// Constructor
	// +Teacher(name: String, address: String)
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}

	// +addCourse(course: String): boolean
	// this method adds new course
	// if the course already existed, returns 'false'
	public boolean addCourse(String course) {
		for (int i = 0; i < numCourses; ++i) {
			if (courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		++numCourses;
		return true;
	}

	// +removeCourse(course: String): boolean
	// this method removes specified course
	// if the course does not exist, returns false
	public boolean removeCourse(String course) {
		boolean foundCourse = false;
		int foundIndex = 0;
		for (int i = 0; i < numCourses; ++i) {
			if (courses[i].equals(course)) {
				foundCourse = true;
				foundIndex = i;
				break;
			}
		}
		if (foundCourse) {
			for (int i = foundIndex; i < numCourses - 1; ++i)
				courses[i] = courses[i + 1];
			--numCourses;
			return true;
		} else
			return false;
	}
}
