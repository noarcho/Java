package programming5;

public class BankAccount {
	private String name, account_number;
	private int balance;
	private double rate;
	
	public BankAccount(){
		this.name = null;
		this.account_number = null;
		this.balance = 0;
		this.rate = 0;
	}
	
	public BankAccount(String name, String account_number, int balance, int rate){
		this.name = name;
		this.account_number = account_number;
		this.balance = balance;
		this.rate = rate;
	}
}
