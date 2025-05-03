package myProjects.calculator.calculator2;

import java.util.Scanner;

public class Test {

	private static final Scanner SCAN = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	private static void startCalculator(Calculator calculator) {
		calculator.listMathFunction();
		System.out.print("Please enter the name of the function (or \"x\" for exit): ");
		String functionName = SCAN.next();
		if (functionName.equalsIgnoreCase("x")) {
			System.out.println("exit!");
			System.exit(0);
		}
		System.out.println("Numver of the arguments: ");
		String argumentCount = SCAN.next();
	}
}
