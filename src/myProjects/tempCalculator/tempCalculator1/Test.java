package myProjects.tempCalculator.tempCalculator1;

import java.util.Scanner;

public class Test {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		TempX xObj = new TempX();
		start(xObj);
	}

	public static void start(TempX xObj) {
		double result = 0.0;
		System.out.print("Please enter the name of the temp type: ");
		String tempType1 = INPUT.next();
		System.out.print("Please enter the arg: ");
		double arg = INPUT.nextDouble();
		System.out.print("Please enter the name of the temp that you want to convert: ");
		String tempType2 = INPUT.next();

		ITemperature temp1 = returnType(tempType1);
		ITemperature temp2 = returnType(tempType2);
		if (temp1.equals(null) || temp2.equals(null))
			System.out.println("start again");
		else
			result = xObj.doCalculation(temp1, temp2, arg);

		System.out.println(arg + " " + tempType1 + " -> " + result + " " + tempType2);
	}

	public static ITemperature returnType(String tempType) {
		ITemperature t;
		switch (tempType.toLowerCase()) {
		case "celcius":
			t = new Celcius();
			break;
		case "fahrenheit":
			t = new Fahrenheit();
			break;
		case "kelvin":
			t = new Kelvin();
			break;
		default:
			t = null;
		}
		return t;
	}
}