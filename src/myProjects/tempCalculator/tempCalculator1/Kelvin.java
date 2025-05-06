package myProjects.tempCalculator.tempCalculator1;

public class Kelvin extends AbstractTemperature {

	// Constructor
	// +Celcius()
	public Kelvin() {
		super("Kelvin");
	}

	@Override
	public double calculate(ITemperature tempType, double arg) {
		double result = 0.0;
		if (tempType instanceof Celcius c)
			result = arg - 273.15;
		else if (tempType instanceof Fahrenheit f)
			result = (1.8 * (arg - 273.15)) + 32;
		return result;

	}
}
