package LAB;

class BankAccount {
	int balance;
	void deposit(int amount){
		balance += amount;
	}
	void withdraw(int amount){
		if(balance <= 0)
			System.out.println("�ܰ� �����մϴ�.");
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
// public�� ������ �ִ� Ŭ������ ���ϸ�� ��ġ�ϴ� Ŭ�������̴�.