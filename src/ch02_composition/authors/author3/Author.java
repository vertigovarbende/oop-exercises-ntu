package ch02_composition.authors.author3;

public class Author {

	// The private instance variables
	private String name;
	private String email;

	// Constructor
	// +Author(name:String, email:String)
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
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

	// toString() method
	@Override
	public String toString() {
		return String.format("Author[name=%s,email=%s]", name, email);
	}

}
