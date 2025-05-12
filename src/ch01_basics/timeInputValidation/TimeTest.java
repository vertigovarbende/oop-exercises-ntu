package ch01_basics.timeInputValidation;

public class TimeTest {

	public static void main(String[] args) {
		// Test to see if the input validation will work? or not.
		
		Time myTime = new Time(45, 65, 25);
		// error: invalid minute 65
		// exit with exit code 1 for abnormal termination
		System.out.println(myTime);
		
	}
}
