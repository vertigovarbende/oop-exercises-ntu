package myProjects.university_v2;

import java.util.Date;
import java.util.Random;

public class GraduateStudent extends Student {

	// The protected instance variables
	protected String advisor; // The advisor of the graduate student
	protected String thesis; // The thesis of the graduate student
	
	// The static variables 
	protected static boolean advisorAvaiable = false; 
	protected static Random rand = new Random(); // the initialize advisorAvaiable

	// Constructor

	// +GraduateStudent(no: int, name: String, year: int, dob: Date, major: String,
	// advisor: String, thesis: String)
	public GraduateStudent(int no, String name, int year, String dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}

	// +study(): void
	// this method allows the student to work/study
	@Override
	public void study() {
		System.out.print("Graduated student ");
		super.study();
	}

	// +register(): void
	// this method allows the student to enroll in school
	@Override
	public void register() {
		System.out.print("Graduated student ");
		super.register();
	}

	// +writeThesis(): void
	public void writeThesis() {
		System.out.println("Graduated student " + name + " is working on his " + thesis + " thesis ");
	}
	
	// +meetWithAdvisor(): void
	public void meetWithAdvisor() {
		advisorAvaiable = rand.nextBoolean();
		if (advisorAvaiable)
			System.out.println("You can meet advisor now!");
		else
			System.out.println("Advisor is not avaiable now! get contact with your advisor to another day!");
	}
	
	// toString()
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "status: GraduateStudent " 
				+ "advisor: " + advisor
				+ "thesis: " + thesis;
	}
}