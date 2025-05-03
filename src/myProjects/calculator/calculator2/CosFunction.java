package myProjects.calculator.calculator2;

public class CosFunction extends AbstractMathFunction {

	// Constructor
	public CosFunction() {
		super("cos");
	}
	
	public double calculate(double... args) {
		return Math.cos(args[0]);
	}
}
