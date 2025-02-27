package myProjects.university;

public class Base {

	// Department
	Department department1 = new Department("Software Engineering", "F");

	// Deparment Head and Department's Professor
	Professor professor1 = new Professor("FT1", "Akin Kaldiroglu", "12.09.1978", "Prof", department1);
	Professor professor2 = new Professor("FT2", "Birsen Cetin", "07.03.1992", "Prof", department1);

	// Akin Kaldiroglu
	Course course1 = new Course("F1", "Object Oriented Programming with Java", professor1, department1, "22.05.2024",
			"29.05.2024", "05.06.2024", "12.06.2024");
	// Birsen Cetin
	Course course2 = new Course("F2", "Database Management Systems", professor2, department1, "24.05.2024",
			"31.05.2024", "07.06.2024");

	/**
	 * This student takes these two courses -> F1, F2 His advisor is -> professor1
	 */
	Student student1 = new Student("1111111111", "Erdem Yusuf Kaya", "13.12.2008", department1, professor1, course1,
			course2);

	/**
	 * This student takes only this course -> F2 Her advisor is -> professor2
	 */

	Student student2 = new Student("2123022222", "John Blabla", "05.04.2005", department1, professor2, course2);

	/**
	 * This student takes only this course -> F1 Her advisor is -> professor2
	 */

	Student student3 = new Student("3133313233", "Kimmich Mimy", "24.03.1992", department1, professor1, course1);

	// These are classroom in the department
	Classroom classroom1 = new Classroom("F001", department1, course1, course2);
	Classroom classroom2 = new Classroom("F202", department1, course2);
	Classroom classroom3 = new Classroom("F102", department1, course1);

	String[][] details = { { department1.getName(), " ", " " }, { department1.getBuildingName(), " ", " " },
			{ professor1.getName(), professor2.getName(), " " }, { course1.getCode(), course2.getCode(), " " },
			{ classroom1.getName(), classroom2.getName(), classroom3.getName() },
			{ student1.getName(), student2.getName(), student3.getName() } };

	String[] header = { "Department Name", "Building Name", "Professors", "Courses", "Classrooms", "Students" };
}
