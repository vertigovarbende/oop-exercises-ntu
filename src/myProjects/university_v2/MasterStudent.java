package myProjects.university_v2;

public class MasterStudent extends GraduateStudent {

	// Constructor

	// +MasterStudent(no: int, name: String, year: int, dob: String, major: String,
	// advisor: String, thesis: String)
	public MasterStudent(int no, String name, int year, String dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}

	// +study(): void
	// this method allows the student to work/study
	@Override
	public void study() {
		System.out.print("Master student ");
		super.study();
	}

	// +register(): void
	// this method allows the student to enroll in school
	@Override
	public void register() {
		System.out.print("Master student ");
		super.register();
	}

	// +writeThesis(): void
	public void writeThesis() {
		System.out.println("Master student " + name + " is working on his " + thesis + " thesis ");
	}

	// +meetWithAdvisor(): void
	public void meetWithAdvisor() {
		advisorAvaiable = rand.nextBoolean();
		if (advisorAvaiable)
			System.out.println("You can meet advisor now!");
		else
			System.out.println("Advisor is not avaiable now! get contact with your advisor to another day!");
	}
}
