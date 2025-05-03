package myProjects.university.university1;

public class Test {

	public static void main(String[] args) {
		Base base = new Base();
		base.department1.setHead(base.professor1);
		base.department1.setProfessors(base.professor1, base.professor2);

		String welcomeHeader = "Welcome to Department Of " + base.department1.getName();
		System.out.println(welcomeHeader);
		printStar(welcomeHeader);
		System.out.println("\n");
		printHeader(base.header);
		System.out.println();
		printDetails(base.details);
		System.out.println("\n");

	}

	public static void printStar(String value) {
		for (int i = 0; i < value.length(); ++i)
			System.out.print("*");
	}

	public static String spaceReturn(String value) {
		String space = " ";
		for (int i = 0; i < value.length() - 1; ++i) {
			space += " ";
		}
		return space;
	}

	public static void printHeader(String[] header) {
		for (int i = 0; i < header.length; ++i)
			System.out.println((i + 1) + " - " + header[i]);

		System.out.println();

		for (int i = 0; i < header.length; ++i) {
			if (i <= 1) // 0(1) 1(2)
				System.out.print("          " + (i + 1));
			else if (i <= 3) // 2(3) 3(4)
				System.out.print("        " + (i + 1));
			else if (i == 4)
				System.out.print("    " + (i + 1));
			else
				System.out.print("         " + (i + 1));
		}

		System.out.println();

		for (int i = 0; i < header.length; ++i) {
			if (i <= 1) // 0(1) 1(2)
				System.out.print("          -");
			else if (i <= 3) // 2(3) 3(4)
				System.out.print("        -");
			else if (i == 4)
				System.out.print("    -");
			else
				System.out.print("         -");
		}

	}

	public static void printDetails(String[][] details) {

		/*
		 * int sayac = 0; for(int i = 0; i < details.length; ++i) sayac +=
		 * details[i][0].length(); System.out.println(sayac);
		 */

		for (int i = 0; i < details.length; ++i) {
			System.out.print(details[i][0] + " ");
			if (i < 2)
				details[i][1] = spaceReturn(details[i][0]);
		}

		System.out.println();

		for (int i = 0; i < details.length; ++i) {
			System.out.print(details[i][1] + " ");
			if (i == 2)
				System.out.print("   ");
			if (i < 2)
				details[i][2] = spaceReturn(details[i][0]);
			else if (i > 1 & i < 4)
				details[i][2] = spaceReturn(details[i][1]);
		}

		System.out.println();

		for (int i = 0; i < details.length; ++i) {
			if (i == 2)
				System.out.print("   ");
			System.out.print(details[i][2] + " ");
		}

	}

}
