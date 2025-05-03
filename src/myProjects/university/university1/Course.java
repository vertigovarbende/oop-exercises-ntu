package myProjects.university.university1;

import java.util.Date;

public class Course {

	// The private instance variables
	private String code;
	private String name;
	private Department department;
	private Professor teacher;
	private Student[] students;
	private String[] days;
	private Date time;

	// Constructors

	// +Course() - default constructor
	public Course() {

	}

	// +Course(code: String, name: String, teacher: Professor, department:
	// Department, days: String[])
	public Course(String code, String name, Professor teacher, Department department, String... days) {
		this.code = code;
		this.name = name;
		this.teacher = teacher;
		this.department = department;
		this.days = days;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'code'
	public String getCode() {
		return code;
	}

	// Setter method for private instance variable 'code'
	public void setCode(String code) {
		this.code = code;
	}

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Setter method for private instance variable 'name'
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for private instance variable 'department'
	public Department getDepartment() {
		return department;
	}

	// Setter method for private instance variable 'department'
	public void setDepartment(Department department) {
		this.department = department;
	}

	// Getter method for private instance variable 'teacher'
	public Professor getTeacher() {
		return teacher;
	}

	// Setter method for private instance variable 'teacher'
	public void setTeacher(Professor teacher) {
		this.teacher = teacher;
	}

	// Getter method for private instance variable 'students'
	public Student[] getStudents() {
		return students;
	}

	// Setter method for private instance variable 'students'
	public void setStudents(Student[] students) {
		this.students = students;
	}

	// Getter method for private instance variable 'days'
	public String[] getDays() {
		return days;
	}

	// Setter method for private instance variable 'days'
	public void setDays(String[] days) {
		this.days = days;
	}

	// Getter method for private instance variable 'time'
	public Date getTime() {
		return time;
	}

	// Setter method for private instance variable 'time'
	public void setTime(Date time) {
		this.time = time;
	}

}
