package basics.time;

public class Time {

	// The private instance variable
	private int second, minute, hour;

	// Constructors overloaded

	// smart constructor that initialize the private variables of an instance ->
	// second, minute and hour
	public Time(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	// default constructor that initialize the private variables of an instance with
	// zero
	public Time() {
		second = 0;
		minute = 0;
		hour = 0;
	}

	// Getters and Setters methods

	// Getter method for private variable second
	public int getSecond() {
		return second;
	}

	// Setter method for private variable second
	public void setSecond(int second) {
		this.second = second >= 0 && second < 60 ? second : -1;
	}

	// Getter method for private variable minute
	public int getMinute() {
		return minute;
	}

	// Setter method for private variable minute
	public void setMinute(int minute) {
		this.minute = minute >= 0 && minute < 60 ? minute : -1;
	}

	// Getter method for private variable hour
	public int getHour() {
		return hour;
	}

	// Setter method for private variable hour
	public void setHour(int hour) {
		this.hour = hour >= 0 && hour < 24 ? hour : -1;
	}

	// toString method
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	// setTime method
	public void setTime(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	// nextSecond method
	public Time nextSecond() {
		++second;
		if (second == 60) {
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
		return this; // Return "this" instance, to support chaining operations
		
//	      ++second;
//	      if (second >= 60) {
//	         second = 0;
//	         ++minute;
//	         if (minute >= 60) {
//	            minute = 0;
//	            ++hour;
//	            if (hour >= 24) {
//	               hour = 0;
//	            }
//	         }
//	      }
//	      return this
	}

}
