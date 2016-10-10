package test08;

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