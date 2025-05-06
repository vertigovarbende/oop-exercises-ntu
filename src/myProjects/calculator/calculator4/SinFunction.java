package myProjects.calculator.calculator4;

public class SinFunction extends AbstractMathFunction {

	// Constructor
	
	// +SinFunction()
	public SinFunction() {
		super("sin");
	}
	
	public double calculate(double... args) {
		return Math.sin(args[0]);
	}
}
