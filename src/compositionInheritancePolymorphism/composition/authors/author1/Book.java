package compositionInheritancePolymorphism.composition.authors.author1;

public class Book {

	// The private instance variables
	private String name;
	private Author author;
	private double price;
	private int quantity;
	
	// Constructors
	
	// +Book(name:String, author:Author, price:double)
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
		quantity = 0;
	}
	
	// +Book(name:String, author:Author, price:double, quantity:int)
	public Book(String name, Author author, double price, int quantity) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Getter and Setter methods
	
	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}
	
	// Getter method for private instance variable 'author'
	public Author getAuthor() {
		return author;
	}
	
	// Getter method for private instance variable 'price'
	public double getPrice() {
		return price;
	}
	
	// Setter method for private instance variable 'price'
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Getter method for private instance variable 'quantity'
	public int getQuantity() {
		return quantity;
	}
	
	// Setter method for private instance variable 'quantity'
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// toString() method
	@Override
	public String toString() {
		return String.format("Book[name=%s,%s,price=%.2f,quantity=%d]", name, author, price, quantity);
	}
	
	// New Getter and Setter methods
	
	// Getter method for author's name
	public String getAuthorName() {
		return author.getName();
	}
	
	// Getter method for author's email
	public String getAuthorEmail() {
		return author.getEmail();
	}
	
	// Getter method for author's gender
	public char getAuthorGender() {
		return author.getGender();
	}
}
