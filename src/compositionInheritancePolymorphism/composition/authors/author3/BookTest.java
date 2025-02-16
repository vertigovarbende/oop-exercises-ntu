package compositionInheritancePolymorphism.composition.authors.author3;

public class BookTest {
	public static void main(String[] args) {
		// Test Author class
		Author authorObj = new Author("Stephen King", "stephenKing@nowhere.com");
		System.out.println(authorObj);

		authorObj.setEmail("stephenKing123@somewhere.com");
		System.out.println(authorObj);
		System.out.println("name is: " + authorObj.getName());
		System.out.println("email is: " + authorObj.getEmail());

		// Test Book class
		Book bookObj = new Book("12345", "It", authorObj, 8.8, 88);
		System.out.println(bookObj);

		bookObj.setPrice(9.9);
		bookObj.setQuantity(99);
		System.out.println(bookObj);
		System.out.println("isbn is: " + bookObj.getIsbn());
		System.out.println("name is: " + bookObj.getName());
		System.out.println("price is: " + bookObj.getPrice());
		System.out.println("quantity is: " + bookObj.getQuantity());
		System.out.println("author is: " + bookObj.getAuthor()); // Author's toString()
		System.out.println("author's name: " + bookObj.getAuthorName());
		System.out.println("author's name: " + bookObj.getAuthor().getName());
		System.out.println("author's email: " + bookObj.getAuthor().getEmail());
		
		
		// Test equals method
		
		Book anotherBookObj1 = new Book("12345", "It", authorObj, 8.8, 88);
		Book anotherBookObj2 = new Book("32345", "It2", authorObj, 7.2, 98);
		
		System.out.println();
		System.out.println(bookObj.equals(anotherBookObj1));
		// true
		System.out.println(bookObj.equals(anotherBookObj2));
		// false
	}
}
