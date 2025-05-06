package myProjects.calculator.calculator2;

import java.util.Scanner;

public class Test {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {

		CalculatorX calObj = new CalculatorX(3);
		calObj.addFunction(new Exp2Function());
		calObj.addFunction(new Exp3Function());
		calObj.addFunction(new FibFunction());

		startCalculator(calObj);
	}

	public static void startCalculator(CalculatorX calculator) {
		calculator.listMathFunction();
		System.out.print("Please enter the name of the function: ");
		String functionName = SCAN.next();
		if (functionName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.print("Please enter the arg: ");
		double arg = SCAN.nextDouble();
		double result = calculator.doCalculation(functionName, arg);
		System.out.println(functionName + " of " + arg + " is " + result + "\n");
		startCalculator(calculator);
	}
}
