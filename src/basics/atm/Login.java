package basics.atm;

import java.util.Scanner;

public class Login {

	// + login(account:Account):boolean
	// The login method checks if the userName and password are correct or not!
	// if the both value are correct, method will return true value,
	// if aren't it, will return false value
	public boolean login(Account account) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter your user name: ");
		String userName = scan.next();
		System.out.print("Please enter your password: ");
		String password = scan.next();

		if (account.getUserName().equals(userName) && account.getPassword().equals(password))
			return true;
		else
			return false;
	}

}
