package myProjects.calculator.calculator4;

public abstract class AbstractMathFunction implements NArgMathFunction{

	// The protected instance variable
	protected String name;
	
	// Constructor
	// +AbstractMathFunction(name: String)
	public AbstractMathFunction(String name) {
		this.name = name;
	}
	
	// The getter method for instance variable 'name'
	public final String getName() {
		return name;
	}
	
}
