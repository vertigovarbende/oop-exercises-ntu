package compositionInheritancePolymorphism.composition.customer.customer1;

public class Invoice {

	// The private instance variables
	private int id;
	private Customer customer;
	private double amount;

	// Constructor
	// +Invoice(id:int, customer:Customer, amount:double)
	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	// Getter and Setter method

	// Getter method for private instance variable 'id'
	public int getId() {
		return id;
	}

	// Getter method for private instance variable 'customer'
	public Customer getCustomer() {
		return customer;
	}

	// Setter method for private instance variable 'customer'
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	// Getter method for private instance variable 'amount'
	public double getAmount() {
		return amount;
	}

	// Setter method for private instance variable 'amount'
	public void setAmount(double amount) {
		this.amount = amount;
	}

	// Getter method for customer's id
	public int getCustomerId() {
		return customer.getId();
	}

	// Getter method for customer's name
	public String getCustomerName() {
		return customer.getName();
	}

	// Getter method for customer's discount
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}

	// getAmountAfterDiscount():double
	// This method returns the amount after discount
	public double getAmountAfterDiscount() {
		return amount - ((amount * customer.getDiscount()) / 100);
	}

	// toString()
	public String toString() {
		return String.format("Invoice[id=%d,customer=%s,amount=%.2f]", id, customer, amount);
	}

}
