package inheritance.introduction;

/*
 * Student is a subclass of Person
 */
public class Student extends Person{

	// The private instance variables
	private int numCourses; // number of the courses
	private String[] courses; // courses
	private int[] grades; // grade for the corresponding course codes
	private static final int MAX_COURSES = 30; // maximum number of courses

	// Constructor
	// +Student(name: String, address: String)
	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}
	
	// +addCourseGrade(course: String, grade: int): void
	// this method adds a course and its grade 
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	// +printGrades(): void
	// this method prints all grades of the student
	public void printGrades() {
		System.out.println(this);
		for (int i = 0; i < numCourses; ++i)
			System.out.println("course: " + courses[i] + " grade: " + grades[i]);
		System.out.println();
	}
	
	// +getAverageGrade(): double
	// this method calculates the average of the grades and returns
	public double getAverageGrade() {
		double sum = 0.0;
		// don't use 'grades.length' here because grades' length is 30!
		for (int i = 0; i < numCourses; ++i)
			sum += grades[i];
		return sum / numCourses;
	}
	
	// +toString()
	@Override
	public String toString() {
		return String.format("Student: %s", super.toString());
	}
}
