package myProjects.university.university3;

import java.util.Date;

public abstract class AbstractStudent implements IStudent {

	// The protected instance variables
	protected int no;
	protected String name;
	protected int year;
	protected String dob;
	protected String major;

	// Constructor
	// +AbstractStudent(no: int, name: String, year: int, dob: String, major:
	// String)
	public AbstractStudent(int no, String name, int year, String dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
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