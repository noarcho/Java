package example;

public class BankAccount {
	private String owner;
	private int accountNumber;
	private int balance = 0;

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

	public String toString() {
		return "���� �ܾ��� " + balance + " �Դϴ�.";
	}
}
