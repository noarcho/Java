package example;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		
		System.out.println(account);
		
		account.withdraw(5500);
		
		System.out.println(account);
	}
}
