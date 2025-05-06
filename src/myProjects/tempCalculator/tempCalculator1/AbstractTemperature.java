package myProjects.tempCalculator.tempCalculator1;

public abstract class AbstractTemperature implements ITemperature {

	// The protected instance variable
	protected String name;
	
	// Constructor
	// +AbstractTemperature()
	public AbstractTemperature(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
