package composition.customer.customer3;

public class Account {

	private int id;
	private Customer customer;
	private double balance;

	// Constructors

	// Account(id: int, customer: Customer, balance: double)
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	// Account(id: int, customer: Customer)
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
		balance = 0.0;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'balance'
	public double getBalance() {
		return balance;
	}

	// Setter method for private instance variable 'balance'
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Getter method for private instance variable 'id'
	public int getId() {
		return id;
	}

	// Getter method for private instance variable 'customer'
	public Customer getCustomer() {
		return customer;
	}

	// toString method
	@Override
	public String toString() {
		return customer + " " + String.format("balance=$%.2f", balance);
	}

	// +getCustomerName(): String
	// it returns the name of the customer
	public String getCustomerName() {
		return customer.getName();
	}

	// +deposit(amount: double): Account
	// it deposits specified amount of money to the customer's account
	public Account deposit(double amount) {
		balance += amount;
		return this;
	}

	// +withdraw(amount: double): Account
	// it withdraws specified amount of money from the customer's account.
	// it also checks whether there is enough money and if there isn't, it returns
	// account's info
	public Account withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Amount withdrawn exceeds the current balance!");
		return this;
	}

}
