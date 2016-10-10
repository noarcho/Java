package programming6;

public class BankAccount {
	private int balance = 0;

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		if (balance <= 0)
			System.out.println("잔고가 부족합니다.");
		else
			balance -= amount;
	}

	public int getBalance() {
		return balance;
	}
	
	public int transfer(int amount, BankAccount otherAccount){
		balance -= amount;
		otherAccount.balance += amount;
		return balance;
	}	
}
