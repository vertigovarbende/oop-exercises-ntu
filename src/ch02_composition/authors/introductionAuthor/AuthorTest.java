package ch02_composition.authors.introductionAuthor;

public class AuthorTest {
	public static void main(String[] args) {
		// Test constructor and toString()
		Author authorObj = new Author("Stehpen King", "stephenKing@gmail.com", 'm');
		System.out.println(authorObj);

		// Test Setters and Getters
		authorObj.setEmail("StephenKing_1@gmail.com");
		System.out.println(authorObj); // authorObj.toString()
		// Stephen King (m) at StephenKing_1@gmail.com
		System.out.println("Author's name is: " + authorObj.getName());
		// Author's name is: Stephen King
		System.out.println("Author's gender is: " + authorObj.getGender());
		// Author's gender is: m
		System.out.println("Author's email is: " + authorObj.getEmail());
		// Author's email is: StephenKing_1@gmail.com

	}
}
