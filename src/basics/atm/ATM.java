package basics.atm;

import java.util.Scanner;

public class ATM {

	Login login = new Login();

	// +start(account:Account):void
	public void start(Account account) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the our bank!");
		printStar("Welcome to the our bank!");
		System.out.println("User Login");
		printStar("User Login");

		int rightOfAccess = 3;

		while (true) {
			if (login.login(account)) {
				System.out.println("Login successful!");
				printStar("Login successful!");
				break;
			} else {
				--rightOfAccess;
				System.out.println("Your user name or your password is wrong! please try to login again!");
				System.out.println("Your right of access: " + rightOfAccess);
				if (rightOfAccess == 0) {
					System.out.println("You finished your right of access, your account block for 15 min!");
					printStar("You finished your right of access, your account block for 15 min!");
					return;
				}
			}
		}

		String transactions = "1. Show balance\n" + "2. Deposit money\n" + "3. Withdraw money\n"
				+ "4. Press q for exit\n";
		System.out.print(transactions);
		printStar(transactions);

		while (true) {
			System.out.print("Enter: ");
			String transaction = scan.nextLine();

			if (transaction.equals("q"))
				break;
			else if (transaction.equals("1"))
				System.out.println("Your current balance is: " + account.getBalance());
			else if (transaction.equals("2")) {
				System.out.print(
						"Please enter the how much amount of money you would like to deposit into your bank account: ");
				account.depositMoney(scan.nextInt());
				scan.nextLine();
			} else if (transaction.equals("3")) {
				System.out.print(
						"Please enter the how much amount of money you would like to withdraw from your bank account: ");
				account.withdrawMoney(scan.nextInt());
				scan.nextLine();
			} else
				System.out.println("Invalid transaction! please enter the correct transaction");
		}

	}

	public static void printStar(String textLength) { // discuss whether this method should be static or not!
		for (int i = 0; i < textLength.length(); ++i)
			System.out.print("*");
		System.out.println();
	}
}
