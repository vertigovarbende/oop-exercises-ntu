package myProjects.calculator.calculator2;

public class LogFunction extends AbstractMathFunction {

	// Constructor
	public LogFunction() {
		super("log");
	}
	
	public double calculate(double... args) {
		return Math.log(args[0]);
	}
}
