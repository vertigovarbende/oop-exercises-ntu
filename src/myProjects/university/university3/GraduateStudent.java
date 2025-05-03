package myProjects.university.university3;

import java.util.Random;

public class GraduateStudent extends AbstractStudent {

	// The protected instance variables
	protected String advisor;
	protected String thesis;
	protected String status;

	// The static variables
	private static boolean advisorAvaiable = false;
	private static Random rand = new Random(); // the initialize advisorAvaiable

	// Constructor
	// GraduateStudent(no: int, name: String, year: int, dob: String, major: String,
	// advisor: String, thesis: String)
	public GraduateStudent(int no, String name, int year, String dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
		status = "Bachelor";
	}

	@Override
	public void study() {
		System.out.print("Graduated student ");
		System.out.println(name + " student are studying!");
	}

	@Override
	public void register() {
		System.out.print("Graduated student ");
		System.out.println(name + " student are enrolled to " + major + "!");
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
		return super.toString() + "\n" + "status: " + status + "advisor: " + advisor + "thesis: " + thesis;
	}

}