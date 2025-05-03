package myProjects.university.university3;

public class MasterStudent extends GraduateStudent {

	// Constructor

	// +MasterStudent(no: int, name: String, year: int, dob: String, major: String,
	// advisor: String, thesis: String)
	public MasterStudent(int no, String name, int year, String dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
		status = "Master Student";
	}

	// +study(): void
	// this method allows the student to work/study
	@Override
	public void study() {
		System.out.print(status);
		super.study();
	}

	// +register(): void
	// this method allows the student to enroll in school
	@Override
	public void register() {
		System.out.print(status);
		super.register();
	}

	// +writeThesis(): void
	@Override
	public void writeThesis() {
		System.out.println("Master student " + name + " is working on his " + thesis + " thesis ");
	}
}