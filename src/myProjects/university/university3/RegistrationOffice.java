package myProjects.university.university3;

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
	public IStudent getAStudent() {
		IStudent newStudent = null;
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
			newStudent = new MasterStudent(402132, "Joseph", 2021, "21.06.1998", "Mathematic", "Calculus",
					"Prof. Bella");
			break;
		case 3:
			newStudent = new PhdStudent(522642, "Matt", 2021, "11.09.1992", "Physic", "Prof. Bella", "Electric", true);
			break;
		}
		return newStudent;
	}

	// +registerStudent(newStudent: Student): void
	public void registerStudent(IStudent newStudent) {
		if (newStudent instanceof PhdStudent p) {
			if (p.isQualifyingExamTaken()) {
				p.register();
			} else
				System.out.println("You cannot register to the school!");
		} else if (newStudent instanceof MasterStudent m) {
			boolean thesis = scan.nextBoolean();
			if (thesis)
				m.register();
			else
				System.out.println("You cannot register to the school!");
		} else if (newStudent instanceof VocationalStudent v) {
			v.register();
		} else if (newStudent instanceof UndergraduateStudent u) {
			u.register();
		}
	}
}
