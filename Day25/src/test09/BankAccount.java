package test09;

public class BankAccount {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int balance){
		this.balance += balance;
		//System.out.println(getBalance());
	}
	
	public void withdraw(int balance){
		if(this.balance >= balance){
			this.balance -= balance;
		}
		else {
			System.out.println("음수!");
		}
		//System.out.println(getBalance());
	}
}
