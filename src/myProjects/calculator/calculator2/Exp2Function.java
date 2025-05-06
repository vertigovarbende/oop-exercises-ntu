package myProjects.calculator.calculator2;

public class Exp2Function implements MathFunction {

	private static String name = "Exp2";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return Math.pow(arg, 2);
	}

}