package myProjects.university_v2;

public class UndergraduateStudent extends Student {

	// The protected instance variable
	protected String minor; 

	// Constructor

	// +UndergraduateStudent(no: int, name: String, year: int, dob: String, major:
	// String, minor: String)
	public UndergraduateStudent(int no, String name, int year, String dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}
	
	// +study(): void
	// this method allows the student to work/study
	@Override
	public void study() {
		System.out.print("Undergraduate student ");
		super.study();
	}

	// +register(): void
	// this method allows the student to enroll in school
	@Override
	public void register() {
		System.out.print("Undergraduate student ");
		super.register();
	}
	
	// toString()
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "status: VocationalStudent "
				+ "minor: " + minor;
	}
}