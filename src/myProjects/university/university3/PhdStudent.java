package myProjects.university.university3;

public class PhdStudent extends GraduateStudent {

	// The private instance variable
	private boolean qualifyingExamTaken;

	// Constructor

	// +PhdStudent(no: int, name: String, year: int, dob: String, major: String,
	// advisor: String, thesis: String, qualifyingExamTaken: boolean)
	public PhdStudent(int no, String name, int year, String dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
		status = "Phd Student";
	}

	// Getter and Setter methods

	// Getter method for private instance variable qualifyingExamTaken
	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	// Setter method for private instance variable qualifyingExamTaken
	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
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
		System.out.println(status);
		super.register();
	}

	// +writeThesis(): void
	public void writeThesis() {
		System.out.println(status + " " + name + " is working on his " + thesis + " thesis ");
	}

	// +writePaper(): void
	public void writePaper() {
		System.out.println(status + " " + name + " is working on his " + thesis + " paper ");
	}
}