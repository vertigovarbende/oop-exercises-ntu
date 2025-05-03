package myProjects.university.university2;

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
	}

	// +study(): void
	// this method allows the student to work/study
	@Override
	public void study() {
		System.out.print("Phd student ");
		super.study();
	}

	// +register(): void
	// this method allows the student to enroll in school
	@Override
	public void register() {
		System.out.print("Phd student ");
		super.register();
	}

	// +writeThesis(): void
	public void writeThesis() {
		System.out.println("Phd student " + name + " is working on his " + thesis + " thesis ");
	}

	// +writePaper(): void
	public void writePaper() {
		System.out.println("Phd student " + name + " is working on his " + thesis + " paper ");
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\n" + "status: PhdStudent " + "advisor: " + advisor + "thesis: " + thesis;
	}
}