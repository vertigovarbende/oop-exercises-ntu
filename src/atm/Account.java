package atm;

public class Account {

	// The private instance variables

	private String userName;
	private String password;
	private int balance;

	// Smart constructor
	// + Account(userName:String, password:String, balance:int):void
	public Account(String userName, String password, int balance) {
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}

	// Getters and Setters methods

	// Getter method for private instance variable userName
	public String getUserName() {
		return userName;
	}

	// Setter method for private instance variable userName
	public void setUserName(String userName) {
		this.userName = userName;
	}

	// Getter method for private instance variable password
	public String getPassword() {
		return password;
	}

	// Setter method for private instance variable password
	public void setPassword(String password) {
		this.password = password;
	}

	// Getter method for private instance variable balance
	public int getBalance() {
		return balance;
	}

	// Setter method for private instance variable balance
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// + depositMoney(amount:int):void
	// depositMoney method deposits the specified amount of money into the account
	// and informs the customer of the new balance
	public void depositMoney(int amount) {
		balance += amount;
		System.out.println("New balance is: $" + balance);
	}

	// + withdrawMoney(amount:int):void
	// withdrawMoney method withdraws the specified amount of money from the account
	// and informs the customer of the new balance
	public void withdrawMoney(int amount) {
		if (balance - amount < 0)
			System.out.println("You do not have as much money as you want to withdraw. Balance: $" + balance);
		else {
			balance -= amount;
			System.out.println("New balance is: $" + balance);
		}
	}
}
