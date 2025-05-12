package ch02_composition.authors.introductionAuthor;

public class Book {

	// The private instance variables
	private String name;
	private Author author;
	private double price;
	private int qty; // quantity

	// Constructor
	// +Book(name:String, author:Author, price:double, qty:int)
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'price'
	public double getPrice() {
		return price;
	}

	// Setter method for private instance variable 'price'
	public void setPrice(double price) {
		this.price = price;
	}

	// Getter method for private instance variable 'qty'
	public int getQty() {
		return qty;
	}

	// Setter method for private instance variable 'qty'
	public void setQty(int qty) {
		this.qty = qty;
	}

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Getter method for private instance variable 'author'
	public Author getAuthor() {
		return author;
	}

	// toString()
	public String toString() {
		return "'" + name + "' by " + author; // author.toString()
	}

}
