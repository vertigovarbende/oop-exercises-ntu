package ch02_composition.authors.introductionAuthor;

public class Author {

	// The private instance variables
	private String name;
	private String email;
	private char gender; // 'm' or 'f'

	// Smart Constructor
	// +Author(name:String, email:String, gender:char)
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Getter method for private instance variable 'email'
	public String getEmail() {
		return email;
	}

	// Setter method for private instance variable 'email'
	public void setEmail(String email) {
		this.email = email;
	}

	// Getter method for private instance variable 'gender'
	public char getGender() {
		return gender;
	}

	// toString() method
	public String toString() {
		return String.format("%s (%s) at %s", name, gender, email);
	}

}
