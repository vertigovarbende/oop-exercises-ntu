package basics.timeExceptionHandling;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		 Case 1: valid input
//		 int hour = 23, minute = 58, second = 58;
//		 Case 2: invalid input
		int hour = 24, minute = 58, second = 58;

		Time timeObj;

//		without try-catch, the program throw IllegalArgumentException
//		timeObj = new Time(second, minute, hour);

		try {
			timeObj = new Time(second, minute, hour);
			System.out.println("valid input");
			System.out.println("Time is " + timeObj);
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace(); // print error messages
			System.out.print("Error in input. Should the program assing default values? (Y/N): ");
			String value = scan.nextLine();
			if (value.toUpperCase().equals("N")) {
				System.out.print("Hour: ");
				hour = scan.nextInt();
				System.out.print("Minute: ");
				minute = scan.nextInt();
				System.out.print("Second: ");
				second = scan.nextInt();
				try {
					timeObj = new Time(second, minute, hour);
					System.out.println("Time is " + timeObj);
				} catch (IllegalArgumentException newEx) {
					newEx.printStackTrace();
					System.exit(0);
				}

			} else if (value.toUpperCase().equals("Y")) {
				timeObj = new Time();
				System.out.println("Time is " + timeObj);
			} else
				System.out.print("You entered invalid value!");
		}
	}

}
