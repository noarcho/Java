package test09;

public class User extends Thread {
	private BankAccount account;

	public User(BankAccount account) {
		this.account = account;
	}

	@Override
	public void start() {
		for (int i = 0; i < 10000000; i++) {
			account.deposit(1000);
			account.withdraw(1000);
		}
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		User user1 = new User(b);
		User user2 = new User(b);

		user1.start();
		user2.start();
	}
}
