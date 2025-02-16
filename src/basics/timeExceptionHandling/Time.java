package basics.timeExceptionHandling;

public class Time {

	// This class is the same as the other 'Time' classes in the other packages
	// but this one is include exception handling

	// The private instance variables - with input validations
	private int second; // valid range is [0, 59]
	private int minute; // valid range is [0, 59]
	private int hour;	// valid range is [0, 23]

	// Constructors
	
	// Default constructor
	public Time() {
		second = 0;
		minute = 0;
		hour = 0;
	}

	// Smart constructor
	public Time(int second, int minute, int hour) {
		setTime(second, minute, hour); // invoke setters to do input validation
	}
	
	
	// Setters and Getters
	
	// Getter method for private instance variable second
	public int getSecond() {
		return second;
	}
	
	// Setter method for private instance variable second with exception handling
	public void setSecond(int second) {
		if (second < 0 || second > 59)
			throw new IllegalArgumentException("invalid second " + second); // exit automatically
		// Normal operation
		this.second = second;
	}
	
	// Getter method for private instance variable minute
	public int getMinute() {
		return minute;
	}
	
	// Setter method for private instance variable minute with exception handling
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			throw new IllegalArgumentException("invalid minute " + minute); // exit automatically
		this.minute = minute;
	}
	
	// Getter method for private instance variable hour
	public int getHour() {
		return hour;
	}
	
	// Setter method for private instance variable hour with exception handling
	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			throw new IllegalArgumentException("invalid hour " + hour); // exit automatically
		this.hour = hour;
	}
	
	public void setTime(int second, int minute, int hour) {
		this.setSecond(second);
		this.setMinute(minute);
		this.setHour(hour);
	}
	
	// toString() method
	public String toString() {
		return String.format("%02d:%02d:%02d", second, minute, hour);
	}
	
	public Time nextSecond() {
	      ++second;
	      if (second == 60) {  // We are sure that second <= 60 here because of the input validation
	         second = 0;
	         ++minute;
	         if (minute == 60) {
	            minute = 0;
	            ++hour;
	            if (hour == 24) {
	               hour = 0;
	            }
	         }
	      }
	      return this;   // Return this instance, to support chaining
	}
	
}

