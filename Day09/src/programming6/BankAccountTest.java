package programming6;

import org.omg.Messaging.SyncScopeHelper;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.deposit(50000);
		account2.deposit(30000);
		
		System.out.println("���� 1�� �ܾ� : " + account1.getBalance());
		System.out.println("���� 2�� �ܾ� : " + account2.getBalance());
		
		System.out.println("����1 ���� ����Ǿ� " + account1.transfer(12000, account2) + "��ŭ ���ҽ��ϴ�.");
		
		System.out.println("���� 1�� �ܾ� : " + account1.getBalance());
		System.out.println("���� 2�� �ܾ� : " + account2.getBalance());
		
	}
}
