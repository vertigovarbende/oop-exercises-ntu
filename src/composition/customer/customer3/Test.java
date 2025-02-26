package composition.customer.customer3;

public class Test {

	public static void main(String[] args) {

		// (1) Test Constructor and toString()
		Customer myCustomer = new Customer(103, "Steve", 'm');
		System.out.println(myCustomer);
		// Steve(103)
		
		Account myFirstAccount = new Account(1031, myCustomer);
		System.out.println(myFirstAccount);
		// Steve(103) balance=$0.0
		
		Account mySecondAccount = new Account(1032, myCustomer, 250.50);
		System.out.println(mySecondAccount);
		// Steve(103) balance=$250.50
		
		
		// (2) Test Getter and Setter methods
		System.out.println(myCustomer.getId());
		// 103
		System.out.println(myCustomer.getName());
		// Steve
		System.out.println(myCustomer.getGender());
		// m
		
		System.out.println(mySecondAccount.getId());
		// 1032
		System.out.println(mySecondAccount.getCustomer());
		// Steve(103)
		System.out.println(mySecondAccount.getBalance());
		// 250.50
		System.out.println(mySecondAccount.getCustomerName());
		// Steve
		mySecondAccount.setBalance(500.50);
		
		
		// (3) Test deposit() method
		System.out.println(mySecondAccount.deposit(250));
		// Steve(103) balance=$750.50
		
		
		// (4) Test withdrawn() method
		System.out.println(mySecondAccount.withdraw(500));
		// Steve(103) balance=$250.50
		
		System.out.println(mySecondAccount.withdraw(300.25));
		// Amount withdrawn exceeds the current balance!
		// Steve(103) balance=$250.50
		
		
		
		
	}

}
