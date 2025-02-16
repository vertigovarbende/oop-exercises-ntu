package compositionInheritancePolymorphism.composition.authors.introductionAuthor;

public class TestBook {

	public static void main(String[] args) {
		// We need an Author instance to create a Book instance
		Author authorObj = new Author("Stehpen King", "stephenKing@gmail.com", 'm');
		System.out.println(authorObj); // authorObj.toString()
		// Stephen King (m) at stephenKing@gmail.com

		// Test Book's constructor and toString()
		Book bookObj = new Book("it", authorObj, 12.99, 10_000);
		System.out.println(bookObj); // bookObj.toString()
		// 'it' by Stephen King (m) at stephenKing@gmail.com

		// Test Setters And Getters
		bookObj.setPrice(9.99);
		bookObj.setQty(9_000);
		System.out.println("Book's name is: " + bookObj.getName());
		// Book's name is: it
		System.out.println("Book's price is: " + bookObj.getPrice());
		// Book's price is: 9.99
		System.out.println("Book's quantity is: " + bookObj.getQty());
		// Book's quantity is: 9000
		System.out.println("Book's author is: " + bookObj.getAuthor()); // invoke Author's toString()
		// Book's author is: Stephen King (m) at stephenKing@gmail.com

		System.out.println("Author's name is: " + bookObj.getAuthor().getName());
		// Author's name is: Stephen Kings
		System.out.println("Author's email is: " + bookObj.getAuthor().getEmail());
		// Author's email is: stephenKing@gmail.com
		System.out.println("Author's gender is: " + bookObj.getAuthor().getGender());
		// Author's gender is: m

		
		System.out.println();
		// Using an anonymous Auhtor instance to create a Book instance
		Book bookObj2 = new Book("Learn Java", 
				new Author("Author's name ", "authorName@gmail.com", 'f'), // an anonymous Author's instance
				13.99, 5_000);
		System.out.println(bookObj2);
		// 'Learn Java' by Author's name (f) at authorName@gmail.com
		

	}

}
