package myProjects.university;

public class Student {

	// The private instance variables
	private String no;
	private String name;
	private String dob;
	private Department department;
	private Professor advisor;
	private Course[] coursesTaken;

	// Constructors

	// +Student() - default constructor
	public Student() {

	}

	// +Student(no: String, name: String, dob: String, department: Department,
	// advisor: Professor, coursesTaken: Course[])
	public Student(String no, String name, String dob, Department department, Professor advisor,
			Course... coursesTaken) {
		this.no = no;
		this.name = name;
		this.dob = dob;
		this.department = department;
		this.advisor = advisor;
		this.coursesTaken = coursesTaken;
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

	// Getter method for private instance variable 'department'
	public Department getDepartment() {
		return department;
	}

	// Setter method for private instance variable 'department'
	public void setDepartment(Department department) {
		this.department = department;
	}

	// Getter method for private instance variable 'advisor'
	public Professor getAdvisor() {
		return advisor;
	}

	// Setter method for private instance variable 'advisor'
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	// Getter method for private instance variable 'coursesTaken'
	public Course[] getCoursesTaken() {
		return coursesTaken;
	}

	// Setter method for private instance variable 'coursesTaken'
	public void setCoursesTaken(Course[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
}