package inheritance.exercises.person;

public class Staff extends Person {

	// The private instance variables
	private String school;
	private double pay;

	// Constructor

	// +Staff(name: String, address: String, school: String, pay: double)
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'school'
	public String getSchool() {
		return school;
	}

	// Setter method for private instance variable 'school'
	public void setSchool(String school) {
		this.school = school;
	}

	// Getter method for private instance variable 'pay'
	public double getPay() {
		return pay;
	}

	// Setter method for private instance variable 'pay'
	public void setPay(double pay) {
		this.pay = pay;
	}

	// toString()
	@Override
	public String toString() {
		return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
	}
}