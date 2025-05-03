package myProjects.calculator.calculator2;

public class AddFunction extends AbstractMathFunction {

	// Constructor
	public AddFunction() {
		super("add");
	}
	
	public double calculate(double... args) {
		double result = 0;
		for (int i = 0; i < args.length; ++i)
			result += args[i];
		return result;
	}
}
