package ch02_composition.authors.author2;

import ch02_composition.authors.author1.Author;

public class Book {
	
	// The private instance variables
	private String name;
	private Author[] authors;
	private double price;
	private int quantity;
	
	// Constructors
	
	// +Book(name:String, authors:Author[], price:double)
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		quantity = 0;
	}
	
	// +Book(name:String, authors:Author[], price:double, quantity:int)
	public Book(String name, Author[] authors, double price, int quantity) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Getter and Setter methods
	
	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}
	
	// Getter method for private instance variable 'authors'
	public Author[] getAuthors() {
		return authors;
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
	
	// Getter method for Authors' names
	public String getAuthorNames() {
		String authorsNames = "";
		for (int i = 0; i < authors.length; ++i)
			authorsNames += authors[i].getName() + ",";
		return authorsNames;
	}
	
	// toString() method
	@Override
	public String toString() {
		String authorsInfo = "";
		for (int i = 0; i < authors.length; ++i) {
			if (i == authors.length - 1)
				authorsInfo += authors[i];
			else
				authorsInfo += authors[i] + ",";
		}
		return String.format("Book[name=%s,authors={%s},price=%.2f,quantity=%d", name, authorsInfo, price, quantity);
	}

}
