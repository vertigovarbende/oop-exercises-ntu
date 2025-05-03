package myProjects.university.university1;

public class Classroom {

	// The private instance variables
	private String name;
	private String code; // buildingName + name
	private Course[] courses;
	private Department department;

	// Constructors

	// +Classroom() - default constructor
	public Classroom() {

	}

	// +Classroom(name: String, department: Department, courses: Course[any_value])
	public Classroom(String name, Department department, Course... courses) {
		this.name = name;
		this.department = department;
		setCode(name, department);
		this.courses = courses;
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

	// Getter method for private instance variable 'code'
	public String getCode() {
		return code;
	}

	// Setter method for private instance variable 'code'
	public void setCode(String name, Department department) {
		this.code = name + department.getBuildingName();
	}

	// Getter method for private instance variable 'courses'
	public Course[] getCourses() {
		return courses;
	}

	// Setter method for private instance variable 'courses'
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	// Getter method for private instance variable 'department'
	public Department getDepartment() {
		return department;
	}

	// Setter method for private instance variable 'department'
	public void setDepartment(Department department) {
		this.department = department;
	}
}