package ch01_basics.timeInputValidation;

public class Time {

	// The private instance variable
	private int second; // valid range is [0, 59]
	private int minute; // valid range is [0, 59]
	private int hour; // valid range is [0, 23]

	// Input validations are done in the setters
	// All the other methods (such as constructors and setTime()) invoke
	// these setters to perform input validations to avoid code duplication

	// Constructors

	// Default constructor
	public Time() {
		this.second = 0;
		this.minute = 0;
		this.hour = 0;
	}

	public Time(int second, int minute, int hour) {
		// Invoke setters to do input validation
		this.setTime(second, minute, hour);
	}

	// Setters and Getters methods

	// Getter method for private instance variable second
	public int getSecond() {
		return second;
	}

	// Setter method with input validation for private instance variable second
	public void setSecond(int second) {
		// input validation
		// check the ternary operator in the setSecond() method in the first 'TIME'
		// class!
		if (second < 0 || second > 59) {
			System.out.println("error: invalid second " + second);
			System.exit(1);	// non-0 for abnormal termination, 0 for normal
		}
		this.second = second;
	}

	// Getter method for private instance variable minute
	public int getMinute() {
		return minute;
	}

	// Setter method with input validation for private instance variable minute
	public void setMinute(int minute) {
		// input validation
		// check the ternary operator in the setMinute() method in the first 'TIME'
		// class!
		if (minute < 0 || minute > 59) {
			System.out.println("error: invalid minute " + minute);
			System.exit(1);
		}
		this.minute = minute;
	}

	// Getter method for private instance variable hour
	public int getHour() {
		return hour;
	}

	// Setter method with input validation for private instance variable hour
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.println("error: invalid hour " + hour);
			System.exit(1);
		}
		this.hour = hour;
	}

	// setTime(second:Int, minute:Int, hour:Int):void
	// setTime method sets the time instance with new values using setters
	// method(with input validation)
	public void setTime(int second, int minute, int hour) {
		// Invoke setters to do input validation
		this.setSecond(second);
		this.setMinute(minute);
		this.setHour(hour);
	}

	// toString() method
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	// nextSecond():Time
	public Time nextSecond() {
		++second;
		if (second == 60) { // We are sure that second <= 60 here because of the input validation
			second = 0;
			++minute;
			if (minute == 60) {
				minute = 0;
				++hour;
				if (hour == 24)
					hour = 0;
			}
		}
		return this; // Return "this" instance, to support chaining operations
	}

}
