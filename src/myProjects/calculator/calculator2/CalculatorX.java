package myProjects.calculator.calculator2;

public class CalculatorX implements Calculator {

	// The private instance variable
	private int functionCount;
	private int currentCount = 0;

	private MathFunction[] functions;

	// Constructor
	// +CalculatorX(functionCount: int)
	public CalculatorX(int functionCount) {
		this.functionCount = functionCount;
		functions = new MathFunction[functionCount];
	}

	// +addFunction(function: MathFunction)
	public void addFunction(MathFunction function) {
		if (currentCount != functionCount) {
			functions[currentCount] = function;
			++currentCount;
		} else
			System.out.println("You can not add function anymore!");
	}

	// +listMathFunction(): void
	public void listMathFunction() {
		for (MathFunction function : functions)
			System.out.println(function.getName());
	}

	// +doCalculation(functionName: String, args: Double...)
	public double doCalculation(String functionName, double... args) {
		double result = 0.0;
		boolean isFunctionFound = false;
		for (MathFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				result = ((NArgMathFunction) function).calculate(args);
				isFunctionFound = true;
			}
		}
		if (!isFunctionFound)
			System.out.println("No such function found!");
		return result;
	}
}
