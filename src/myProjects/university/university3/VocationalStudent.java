package myProjects.university.university3;

public class VocationalStudent extends AbstractStudent {

	// Constructor

	// +VocationalStudent(no: int, name: String, year: int, dob: String, major:
	// String)
	public VocationalStudent(int no, String name, int year, String dob, String major) {
		super(no, name, year, dob, major);
	}

	// +study(): void
	// this method allows the student to work/study
	@Override
	public void study() {
		System.out.print("Vocational student ");
		System.out.println(name + " student are studying!");
	}

	// +register(): void
	// this method allows the student to enroll in school
	@Override
	public void register() {
		System.out.print("Vocational student ");
		System.out.println(name + " student are enrolled to " + major + "!");
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\n" + "status: VocationalStudent ";
	}
}