package test08;

public class User extends Thread {
	private BankAccount account;
	
	public User(BankAccount account) {
		this.account = account;
	}
}
