package myProjects.calculator.calculator2;

public class SinFunction implements MathFunction {

	private static String name = "Sin";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}
