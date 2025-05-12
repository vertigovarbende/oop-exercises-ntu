package ch02_composition.authors.author3;

public class Book {

	// The private instance variables
	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int quantity;

	// Constructors

	// +Book(isbn:String, name:String, author:Author, price:double)
	public Book(String isbn, String name, Author author, double price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		quantity = 0;
	}

	// +Book(isbn:String, name:String, author:Author, price:double, quantity:int)
	public Book(String isbn, String name, Author author, double price, int quantity) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'isbn'
	public String getIsbn() {
		return isbn;
	}

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

	// Getter method for Author's name
	public String getAuthorName() {
		return author.getName();
	}

	// toString() method
	@Override
	public String toString() {
		return String.format("Book[isbn=%s,name=%s,%s,price=%.1f,quantity=%d]", isbn, name, author, price, quantity);
	}

	// equals() method
	@Override
	public boolean equals(Object obj) {
		boolean isSameBook = false;
		Book otherBook = (Book) (obj);
		if (this.isbn == otherBook.isbn)
			isSameBook = true;
		return isSameBook;
	}
}
