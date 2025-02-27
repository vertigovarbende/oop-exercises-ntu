package myProjects.calculator;

import java.util.Scanner;

public class Calculator {

	// The default instance variables
	Scanner scan = new Scanner(System.in);
	String name;
	String[][] operators = { { "Addition", "+" }, { "Subtraction", "-" }, { "Multiplication", "*" },
			{ "Division", "/" }, { "Mod", "%" }, { "Power", "^" }, { "Factorial", "!" } };

	// Constructor

	// +Calculator() - default constructor
	public Calculator() {

	}

	// Getter and Setter methods

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Setter method for private instance variable 'name'
	public void setName(String newName) {
		name = newName;
	}

	public void WhoAreYou() {
		System.out.println("I'm a calculator, my name is " + name);
	}

	// add, sub, multiply, multiplyByAdding divide, mod, power, sqrt, fact

	// +add(first: int, second: int): int
	public int add(int first, int second) {
		return first + second;
	}

	// +sub(first: int, second: int): int
	public int sub(int first, int second) {
		return first - second;
	}

	// +multiply(first: int, second: int): int
	public int multiply(int first, int second) {
		return first * second;
	}

	// +multiplyByAdding(first: int, second: int): int
	public int multiplyByAdding(int first, int second) {
		int result = 1;
		for (int i = 1; i <= second; ++i)
			result += first;
		return result;
	}

	// +divide(first: int, second: int): double
	public double divide(int first, int second) {
		return ((double) first / second);
	}

	// +mod(first: int, second: int): double
	public double mod(int first, int second) {
		return first % second;
	}

	// +power(first: int, second: int): int
	public int power(int first, int second) {
		int result = 1;
		for (int i = 1; i <= second; ++i)
			result *= first;
		return result;
	}

	// +fact(number: int): int
	public int fact(int number) {
		int fact = 1;
		for (int i = 1; i <= number; ++i)
			fact *= i;
		return fact;
	}

	// +whichOption(): void
	public void whichOption() {
		for (int i = 0; i < operators.length; ++i) {
			System.out.print(" - ");
			for (int j = 0; j < operators[i].length; ++j) {
				if (j == 1)
					System.out.print("'" + operators[i][j] + "'");
				else
					System.out.print(operators[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Please enter which opeator you will use: ");
		String op = scan.nextLine();
		whichOperator(op);
	}

	// +whichOperator(op: String): void
	public void whichOperator(String op) {
		System.out.println();
		if (op != "!") {
			System.out.print("Please enter the value-1: ");
			int first = scan.nextInt();
			System.out.print("Please enter the value-2: ");
			int second = scan.nextInt();

			switch (op) {
			case "+":
				result(add(first, second));
				break;
			case "-":
				result(sub(first, second));
				break;
			case "*":
				result(multiply(first, second));
				break;
			case "/":
				result(divide(first, second));
				break;
			case "%":
				result(mod(first, second));
				break;
			case "^":
				result(power(first, second));
				break;
			}
		} else {
			System.out.print("Please enter the value-1: ");
			int value = scan.nextInt();
			result(fact(value));
		}
	}

	// +result(resultValue: double): void
	public void result(double resultValue) {
		System.out.println("Result: " + resultValue);
	}
}
