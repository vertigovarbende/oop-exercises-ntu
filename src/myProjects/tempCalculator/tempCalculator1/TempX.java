package myProjects.tempCalculator.tempCalculator1;

public class TempX implements ITempCalculator {

	// Constructor
	public TempX() {

	}

	public double doCalculation(ITemperature tempType1, ITemperature tempType2, double arg) {
		double result = 0.0;
		if (tempType1 instanceof Celcius c)
			result = c.calculate(tempType2, arg);
		else if (tempType1 instanceof Fahrenheit f)
			result = f.calculate(tempType2, arg);
		else if (tempType1 instanceof Kelvin k)
			result = k.calculate(tempType2, arg);
		return result;
	}
}
