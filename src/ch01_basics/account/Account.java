package ch01_basics.account;

public class Account {

	// The instance variables
	private int number;
	private double balance;

	// Constructors

	// +Account(number:int)
	public Account(int number) {
		this.number = number;
		balance = 0.0;
//		this(number, 0.0);
	}

	// +Account(number:int, balance:double)
	public Account(int number, double balance) {
		this.number = number;
		this.balance = balance;
	}

	// Getter methods

	// Getter method for private instance variable number
	public int getNumber() {
		return number;
	}

	// Getter method for private instance variable balance
	public double getBalance() {
		return balance;
	}

	// toString()
	public String toString() {
		return String.format("Account[number = %d, balance = $%.2f", number, balance);
	}

	// +debit(amount:double):void
	// This method provides to deposit a specified amount of money into bank account
	public void credit(double amount) {
		balance += amount;
	}

	// +debit(amount:double):void
	// This method provides to withdraw a specified amount of money from bank
	// account
	// If the account balance is less than the specified amount, the method will
	// inform the user "amount exceeded"
	public void debit(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Amount exceeded");
	}

	// +transferTo(amount:double, another:Account):void
	// This method provides to transfer a specified amount of money to another bank
	// account
	// If the account balance is less than the specified amount, the method will
	// inform the user "amount exceeded"
	public void transferTo(double amount, Account another) {
		if (balance >= amount) {
			balance -= amount;
			another.balance += amount;
		}
		else
			System.out.println("Amount exceeded");
	}
}
