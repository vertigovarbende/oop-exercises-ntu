package myProjects.calculator.calculator2;

public class LogFunction implements MathFunction {

	private static String name = "Log";

	public String getName() {
		return name;
	}

	public double calculate(double arg) {
		return Math.log(arg);
	}
}