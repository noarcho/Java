package programming6;

import org.omg.Messaging.SyncScopeHelper;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.deposit(50000);
		account2.deposit(30000);
		
		System.out.println("°èÁÂ 1ÀÇ ÀÜ¾× : " + account1.getBalance());
		System.out.println("°èÁÂ 2ÀÇ ÀÜ¾× : " + account2.getBalance());
		
		System.out.println("°èÁÂ1 ¿¡¼­ ÀÎÃâµÇ¾î " + account1.transfer(12000, account2) + "¸¸Å­ ³²¾Ò½À´Ï´Ù.");
		
		System.out.println("°èÁÂ 1ÀÇ ÀÜ¾× : " + account1.getBalance());
		System.out.println("°èÁÂ 2ÀÇ ÀÜ¾× : " + account2.getBalance());
		
	}
}
