package LAB;

class BankAccount {
	int balance;
	void deposit(int amount){
		balance += amount;
	}
	void withdraw(int amount){
		if(balance <= 0)
			System.out.println("잔고가 부족합니다.");
		else
		balance -= amount;
	}
	int getBalance(){
		return balance;
	}
	void addInterest(){
		System.out.println(balance*0.075);
		balance += balance*0.075;
	}
}
public class BankAccountTest{
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.balance = 100;
		b.withdraw(60);
		System.out.println(b.getBalance());
	}
}
// public이 붙을수 있는 클래스는 파일명과 일치하는 클래스명이다.