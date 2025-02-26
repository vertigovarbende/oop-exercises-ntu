package composition.authors.author2;

import composition.authors.author1.Author;

public class BookTest {

	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0] = new Author("Paul Tan", "paulTan@gmail.com", 'm');
		authors[1] = new Author("Stephen King", "stephenKing@gmail.com", 'm');
		
		Book it = new Book("It", authors, 19.99, 99);
		System.out.println(it);
	}
	
}
