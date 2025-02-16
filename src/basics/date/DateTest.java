package basics.date;

public class DateTest {

	public static void main(String[] args) {

		// Test constructor and toString()

		Date myDateObj = new Date(2019, 5, 8);
		System.out.println(myDateObj); // implicitly call to myDateObj.toString()
		System.out.println();

		// Test Setters and Getters

		myDateObj.setYear(2020);
		System.out.println("year changed: " + myDateObj.getYear());
		myDateObj.setMonth(9);
		System.out.println("month changed: " + myDateObj.getMonth());
		myDateObj.setDay(22);
		System.out.println("day changed: " + myDateObj.getDay());
		System.out.println(myDateObj);
		System.out.println();
		
		// Test setDate
		
		myDateObj.setDate(2023, 7, 4);
		System.out.println(myDateObj);
	}

}
