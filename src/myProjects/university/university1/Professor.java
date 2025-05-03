package myProjects.university.university1;

public class Professor {

	// The private instance variables
	private String no;
	private String name;
	private String dob;
	private String rank;
	private Department department;
	private Student[] advisee;
	private Course[] coursesGiven;

	// Constructors

	// +Professor() - default constructor
	public Professor() {

	}

	// +Professor(no: String, name: String, dob: String, rank: String, department:
	// Department)
	public Professor(String no, String name, String dob, String rank, Department department) {
		this.no = no;
		this.name = name;
		this.dob = dob;
		this.rank = rank;
		this.department = department;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'no'
	public String getNo() {
		return no;
	}

	// Setter method for private instance variable 'no'
	public void setNo(String no) {
		this.no = no;
	}

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Setter method for private instance variable 'name'
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for private instance variable 'dob'
	public String getDob() {
		return dob;
	}

	// Setter method for private instance variable 'dob'
	public void setDob(String dob) {
		this.dob = dob;
	}

	// Getter method for private instance variable 'rank'
	public String getRank() {
		return rank;
	}

	// Setter method for private instance variable 'rank'
	public void setRank(String rank) {
		this.rank = rank;
	}

	// Getter method for private instance variable 'department'
	public Department getDepartment() {
		return department;
	}

	// Setter method for private instance variable 'department'
	public void setDepartment(Department department) {
		this.department = department;
	}

	// Getter method for private instance variable 'advisee'
	public Student[] getAdvisee() {
		return advisee;
	}

	// Setter method for private instance variable 'advisee'
	public void setAdvisee(Student[] advisee) {
		this.advisee = advisee;
	}

	// Getter method for private instance variable 'coursesGiven'
	public Course[] getCoursesGiven() {
		return coursesGiven;
	}

	// Setter method for private instance variable 'coursesGiven'
	public void setCoursesGiven(Course[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
}
