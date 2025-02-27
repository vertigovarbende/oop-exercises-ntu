package myProjects.university;

public class Department {

	// The private instance variables
	private String name;
	private String buildingName;
	private Professor head;
	private Professor[] professors;
	private Course[] courses;
	private Student[] students;

	// Constructors

	// +Department() - default constructor
	public Department() {

	}

	// +Department(name: String, buildingName: String)
	public Department(String name, String buildingName) {
		this.name = name;
		this.buildingName = buildingName;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Setter method for private instance variable 'name'
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for private instance variable 'buildingName'
	public String getBuildingName() {
		return buildingName;
	}

	// Setter method for private instance variable 'buildingName'
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	// Getter method for private instance variable 'head'
	public Professor getHead() {
		return head;
	}

	// Setter method for private instance variable 'head'
	public void setHead(Professor head) {
		this.head = head;
	}

	// Getter method for private instance variable 'courses'
	public Course[] getCourses() {
		return courses;
	}

	// Setter method for private instance variable 'courses'
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	// Getter method for private instance variable 'students'
	public Student[] getStudents() {
		return students;
	}

	// Setter method for private instance variable 'students'
	public void setStudents(Student[] students) {
		this.students = students;
	}

	// Getter method for private instance variable 'professor'
	public Professor[] getProfessors() {
		return professors;
	}

	// Setter method for private instance variable 'professor'
	public void setProfessors(Professor... professors) {
		this.professors = professors;
	}
}