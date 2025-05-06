package myProjects.calculator.calculator2;

public class FibFunction implements MathFunction {

	private static String name = "Fib";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		if (arg <= 0)
			return 0;
		else if (arg == 1)
			return 1;
		else
			return calculate(arg - 1) + calculate(arg - 2);
	}
}