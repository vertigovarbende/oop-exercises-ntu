package myProjects.tempCalculator.tempCalculator1;

public interface ITemperature {

	double calculate(ITemperature tempType, double arg);
	
	String getName();
}
