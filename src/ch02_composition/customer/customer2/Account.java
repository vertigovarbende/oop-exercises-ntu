package ch02_composition.customer.customer2;

public class Account {

	// The private instance variables
	private int id;
	private Customer customer;
	private double balance;
	
	// Constructors
	
	// +Account(id:int, customer:Customer)
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
		balance = 0.0;
	}
	
	// +Account(id:int, customer:Customer, balance:double)
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	// Getter and Setter methods
	
	// Getter method for private instance variable 'id'
	public int getId() {
		return id;
	}
	
	// Getter method for private instance variable 'customer'
	public Customer getCustomer() {
		return customer;
	}
	
	// Getter method for private instance variable 'balance'
	public double getBalance() {
		return balance;
	}
	
	// Setter method for private instance variable 'balance'
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// toString() method
	public String toString() {
		return String.format("%s balance=$%.2f", customer, balance);
	}
	
	// +getCustomerName():String
	// This method returns customer's name
	public String getCustomerName() {
		return customer.getName();
	}
	
	// +deposit(amount:double):Account
	// This method adds the given specific amount to the balance
	public double deposit(double amount) {
		return 0.0;
	}
}
