package myProjects.calculator.calculator4;

public class LogFunction extends AbstractMathFunction {

	// Constructor
	public LogFunction() {
		super("log");
	}
	
	public double calculate(double... args) {
		return Math.log(args[0]);
	}
}
