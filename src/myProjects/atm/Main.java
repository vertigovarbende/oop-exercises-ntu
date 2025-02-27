package myProjects.atm;

public class Main {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Account account = new Account("username", "1234", 2000);
		
		atm.start(account);

	}

}
