package myProjects.calculator.calculator2;

public class Exp3Function implements MathFunction {

	private static String name = "Exp3";
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double calculate(double arg) {
		return Math.pow(arg, 3);
	}
}