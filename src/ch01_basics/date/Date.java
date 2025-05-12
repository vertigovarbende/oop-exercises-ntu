package ch01_basics.date;

public class Date {

	// private instance variables
	private int year;
	private int month;
	private int day;
	
	// Constructor
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// Getters & Setters for private instance variables
	
	// Getter method for private variable year
	public int getYear() {
		return year;
	}
	
	// Setter method for private variable year
	public void setYear(int year) {
		this.year = year;
	}
	
	// Getter method for private variable month
	public int getMonth() {
		return month;
	}
	
	// Setter method for private variable month
	public void setMonth(int month) {
		this.month = month;
	}
	
	// Getter method for private variable day
	public int getDay() {
		return day;
	}
	
	// Setter method for private variable day
	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
		// String.format method
		return String.format("%02d/%02d/%4d", month, day, year);
	}
	
	// set date
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}
