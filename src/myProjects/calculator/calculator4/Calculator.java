package myProjects.calculator.calculator4;

public interface Calculator {

	// +addFunction(function: MathFunction)
	/* addFunction() method adds new function to the calculator */
	void addFunction(MathFunction function);

	// +listMathFunction(): void
	/* listMathFunction() display all functions in the calculator */
	void listMathFunction();

	// +doCalculation(functionName: String, argCount: double, argType: String):
	// double
	/*
	 * doCalculation() method takes functionName, the number of argument, the type
	 * of the arguments and calculates
	 */
	double doCalculation(String functionName, double... args);
}
