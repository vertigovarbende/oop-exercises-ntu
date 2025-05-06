package myProjects.tempCalculator.tempCalculator1;

public class Fahrenheit extends AbstractTemperature {

	// Constructor
	// +Celcius()
	public Fahrenheit() {
		super("Fahrenheit");
	}

	@Override
	public double calculate(ITemperature tempType, double arg) {
		double result = 0.0;
		if (tempType instanceof Celcius c)
			result = (arg - 32) / 1.8;
		else if (tempType instanceof Kelvin k)
			result = (((arg - 32) * 5) / 9) + 273.15;
		return result;

	}
}
