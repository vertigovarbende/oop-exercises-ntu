package myProjects.university_v2;

import java.util.Date;

public class Student {

	// The protected instance variables
	protected int no; // Student number
	protected String name; // Student name
	protected int year; // The year of starting university
	protected String dob; // Student date of birth
	protected String major; // Student major

	// Constructor

	// +Student(no: int, name: String, year: int, dob: String, major: String)
	public Student(int no, String name, int year, String dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	// study(): void
	// this method allows the student to work/study
	public void study() {
		System.out.println(name + " student are studying!");
	}

	// register(): void
	// this method allows the student to enroll in school
	public void register() {
		System.out.println(name + " student are enrolled to " + major + "!");
	}

	// toString()
	public String toString() {
		return "no: " + no
				+ "name: " + name
				+ "dob: " + dob
				+ "major: " + major
				+ "year: " + year;
	}
}
