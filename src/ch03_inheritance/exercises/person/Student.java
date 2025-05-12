package ch03_inheritance.exercises.person;

public class Student extends Person {

	// The private instance variables
	private String program;
	private int year;
	private double fee;

	// Constructor

	// +Student(name: String, address:String, program: String, year: int, fee:
	// double)
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'program'
	public String getProgram() {
		return program;
	}

	// Setter method for private instance variable 'program'
	public void setProgram(String program) {
		this.program = program;
	}

	// Getter method for private instance variable 'year'
	public int getYear() {
		return year;
	}

	// Setter method for private instance variable 'year'
	public void setYear(int year) {
		this.year = year;
	}

	// Getter method for private instance variable 'fee'
	public double getFee() {
		return fee;
	}

	// Setter method for private instance variable 'fee'
	public void setFee(double fee) {
		this.fee = fee;
	}

	// toString()
	public String toString() {
		return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
	}
}