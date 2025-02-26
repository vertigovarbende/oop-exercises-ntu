package inheritance.exercises.person;

public class TestStaffStudent {

	public static void main(String[] args) {

		// Test constructor and toString()

		// (1) Person
		Person per = new Person("John", "east-side 38 Berlin/Germany");
		System.out.println(per);

		// (2) Student
		Student std1 = new Student("Mary", "east-side 42,Berlin/Germany", "CS", 2021, 12_500);
		System.out.println(std1);

		// (3) Staff
		Staff staff1 = new Staff("Micheal", "west-side 21, München/Germany", "MT", 8750.50);
		System.out.println(staff1);
		
		
		// Test Getter and Setter method
		System.out.println();
		
		// (1) Person
		System.out.println(per.getAddress());
		System.out.println(per.getName());
		per.setAddress("south-side 20 Hamburg/Germany");
		System.out.println(per.getAddress());
		
		// (2) Student
		System.out.println(std1.getAddress() + " " 
				+ std1.getName() + " "
				+ std1.getProgram() + " "
				+ std1.getYear() + " "
				+ std1.getFee());
		std1.setFee(13_500);
		System.out.println(std1.getFee());
		
		// (3) Staff
		System.out.println(staff1.getAddress() + " "
				+ staff1.getName() + " "
				+ staff1.getSchool() + " "
				+ staff1.getPay());
	}
}