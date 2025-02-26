package composition.authors.author1;

public class AuthorTest {

	public static void main(String[] args) {
		Author authorObj = new Author("Stehpen King", "stephenKing@gmail.com", 'm'); // Test the constructor
		System.out.println(authorObj);  // Test toString()
		authorObj.setEmail("stephenKing123@gmail.com");  // Test setter
		System.out.println("name is: " + authorObj.getName());     // Test getter
		System.out.println("email is: " + authorObj.getEmail());   // Test getter
		System.out.println("gender is: " + authorObj.getGender()); // Test getter

	}

}
