package myProjects.calculator.calculator2;

public class CalculatorX implements Calculator {

	// The private instance variable
	private int functionCount;
	private int currentCount = 0;

	private MathFunction[] functions;
	private double argument;

	// Constructor
	// +CalculatorX(functionCount: int)
	public CalculatorX(int functionCount) {
		this.functionCount = functionCount;
		functions = new MathFunction[functionCount];
	}

	// +addFunction(function: MathFunction)
	@Override
	public void addFunction(MathFunction function) {
		functions[currentCount] = function;
		currentCount++;
	}

	// +doCalculation(functionName: String, arg: double)
	@Override
	public double doCalculation(String functionName, double arg) {
		double result = 0.0;
		boolean isFunctionFound = false;
		for (MathFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				result = function.calculate(arg);
				isFunctionFound = true;
			}
		}
		if (!isFunctionFound)
			System.out.println("No such function found!");

		return result;
	}

	// +listMathFunction(): void
	@Override
	public void listMathFunction() {
		System.out.println("Available Functions:");
		for (MathFunction function : functions)
			System.out.println(function.getName());
	}
}