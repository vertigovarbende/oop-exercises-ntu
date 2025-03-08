package myProjects.university_v2;

import java.util.Random;
import java.util.Scanner;

public class RegistrationOffice {

	// The static variables
	private static Random rand = new Random();
	private static Scanner scan = new Scanner(System.in);

	// Constructor

	// +RegistrationOffice() - default constructor
	public RegistrationOffice() {

	}

	// +getAStudent(): Student
	public Student getAStudent() {
		Student newStudent = null;
		int randNumber = rand.nextInt(4);
		switch (randNumber) {
		case 0:
			newStudent = new UndergraduateStudent(318200, "Martin", 2022, "03.03.2004", "Computer Science",
					"Software engineering");
			break;
		case 1:
			newStudent = new VocationalStudent(200212, "Pablo", 2021, "04.02.2003", "International Business");
			break;
		case 2:
			newStudent = new MasterStudent(402132, "Joseph", 2021, "21.06.1998", "Mathematic", "Prof. Bella",
					"Calculus");
			break;
		case 3:
			newStudent = new PhdStudent(522642, "Matt", 2021, "11.09.1992", "Physic", "Prof. Bella", "Materials",
					false);
			break;
		}
		return newStudent;
	}

	// +registerStudent(newStudent: Student): void
	public void registerStudent(Student newStudent) {
		if (newStudent instanceof PhdStudent) {
			System.out.println("exam? (True/False): ");
			boolean exam = scan.nextBoolean();
			if (exam)
				newStudent.register();
			else
				System.out.println("You cannot register to the school!");
		} else if (newStudent instanceof MasterStudent) {
			boolean thesis = scan.nextBoolean();
			if (thesis)
				newStudent.register();
			else
				System.out.println("You cannot register to the school!");
		} else
			newStudent.register();
	}
}