package ch01_basics.account;

public class AccountTest {
	public static void main(String[] args) {
		// Test constructor and toString()
		Account myAccount = new Account(1234);
		System.out.println(myAccount);
		// Account[number = 1234, balance = $0.00]
		
		Account anotherAccount = new Account(2345, 99.9);
		System.out.println(anotherAccount);
		// Account[number = 2345, balance = $99.9]
		
		// Test getters
		System.out.println("The account Number is: " + anotherAccount.getNumber());
		// The account Number is: 2345
		System.out.println("The Balance is: " + anotherAccount.getBalance());
		// The Balance is: 99.9
		
		// Test credit(), debit() and transferTo()
		myAccount.credit(11.1);
		System.out.println(myAccount);
		// Account[number = 1234, balance = $11.1]
		myAccount.debit(5.5);
		System.out.println(myAccount);
		// Account[number = 1234, balance = $5.60]
		myAccount.debit(500);
		// amount exceeded
		System.out.println(myAccount);
		// Account[number = 1234, balance = $5.60]
		
		anotherAccount.transferTo(50, myAccount);
		System.out.println(myAccount);
		// Account[number = 1234, balance = $55.60]
		System.out.println(anotherAccount);
		// Account[number = 2345, balance = $49.9]
	}
}
