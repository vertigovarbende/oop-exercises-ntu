package myProjects.calculator.calculator4;

public class ExponentialFunction extends AbstractMathFunction {

	// Constructor
	public ExponentialFunction() {
		super("exp");
	}
	
	public double calculate(double... args) {
		return Math.pow(args[0], args[1]);
	}
}
