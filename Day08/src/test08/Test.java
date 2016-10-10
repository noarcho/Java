package test08;

import test08.BankAccount;

public class Test {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		
		b1.balance = 1000;
		b2.balance = 1000;
		b3.balance = 1000;
		///////////////////////////////////////////
		BankAccount[] b = new BankAccount[3]; // 객체가 3개 만들어지지 않음!, 참조변수 3개만 생성함
		
		// System.out.println(b[1].balance);
		
		for(int i=0; i<b.length; i++){
			b[i] = new BankAccount();
			b[i].balance = 1000;
		}
		System.out.println(b[1].balance);
	}
}
