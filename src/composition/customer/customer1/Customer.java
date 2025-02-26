package composition.customer.customer1;

public class Customer {

	// The private instance variables
	private int id;
	private String name;
	private int discount;

	// Constructor
	// +Customer(id:int, name:String, discount:int)
	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'id'
	public int getId() {
		return id;
	}

	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}

	// Getter method for private instance variable 'discount'
	public int getDiscount() {
		return discount;
	}

	// Setter method for private instance variable 'discount'
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	// toString() method
	@Override
	public String toString() {
		return String.format("%s(%d)(%d)", name, id, discount);
	}

	// equals() method
	@Override
	public boolean equals(Object obj) {
		if (this.id == ((Customer) obj).id)
			return true;
		return false;
	}

}
