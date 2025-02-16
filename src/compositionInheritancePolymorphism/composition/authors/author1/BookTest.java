package compositionInheritancePolymorphism.composition.authors.author1;

public class BookTest {

	public static void main(String[] args) {
		Author stephenKing = new Author("Stephen King", "stephenKing@gmail.com", 'm');
		System.out.println(stephenKing);  // Author's toString()

		Book it = new Book("It", stephenKing, 19.95, 99);  // Test Book's Constructor
		System.out.println(it);  // Test Book's toString()

		// Test Getters and Setters
		it.setPrice(29.95);
		it.setQuantity(28);
		System.out.println("name is: " + it.getName());
		System.out.println("price is: " + it.getPrice());
		System.out.println("quantity is: " + it.getQuantity());
		System.out.println("Author is: " + it.getAuthor());  // Author's toString()
		System.out.println("Author's name is: " + it.getAuthor().getName());
		System.out.println("Author's email is: " + it.getAuthor().getEmail());

		// Use an anonymous instance of Author to construct a Book instance
		Book anotherBook = new Book("more Java", 
		      new Author("Paul Tan", "paul@gmail.com", 'm'), 29.95);
		System.out.println(anotherBook);  // toString()
		
		
		
		// try
		// 1- Printing the name and email of the author from a Book instance.
		System.out.println();
		System.out.println(anotherBook.getAuthor().getName());
		System.out.println(anotherBook.getAuthor().getEmail());
		
		// 2- test the new setter and getter methods
		System.out.println();
		System.out.println(anotherBook.getAuthorName());
		System.out.println(anotherBook.getAuthorEmail());
		System.out.println(anotherBook.getAuthorGender());
	}
	
}
