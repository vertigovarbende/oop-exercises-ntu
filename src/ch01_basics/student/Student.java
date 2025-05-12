package ch01_basics.student;

public class Student {

	// Private static final variable
	private static final int MAX_COURSES = 30;

	// The private instance variables
	private String name;
	private String address;

	private int numCourses;
	private String[] courses;
	private int[] grades;

	// Constructor
	// Student(name:String, address:String)
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
		numCourses = 0;
	}

	// Getters and Setters methods

	// Getter method for private instance variable name
	public String getName() {
		return name;
	}

	// Getter method for private instance variable address
	public String getAddress() {
		return address;
	}

	// Setter method for private instance variable address
	public void setAddress(String address) {
		this.address = address;
	}

	// toString()
	public String toString() {
		return name + "(" + address + ")";
	}

	// +addCourseGrade(course:String, grade:int):void
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	// +printGrades():void
	public void printGrades() {
		System.out.print(name);
		for (int i = 0; i < numCourses; ++i)
			System.out.print(" " + courses[i] + ":" + grades[i]);
		System.out.println();
	}
	
	// getAverageGrade():double
	public double getAverageGrade() {
		double total = 0.0;
		for (int i = 0; i < numCourses; ++i) 
			total += grades[i];
		return total / numCourses;
	}
}
