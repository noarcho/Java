package test03;

public class BankAccount {
	private String name, acnumber, passwd;
	private int balance;
	
	public BankAccount(String name, String acnumber,
						String passwd, int balance){
		this.name = name;
		this.acnumber = acnumber;
		this.passwd = passwd;
		this.balance = balance;
		System.out.println("회원가입이 완료되었습니다.");
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcnumber() {
		return acnumber;
	}

	public void setAcnumber(String acnumber) {
		this.acnumber = acnumber;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int balance){
		this.balance += balance;
		System.out.println("입금이 완료되었습니다.");
	}
	
	public void withdraw(int balance){
		if(this.balance >= balance){
			this.balance -= balance;
			System.out.println("출금이 완료되었습니다.");
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void print(){
		System.out.println("**********계좌정보**********");
		System.out.println("* 소유주 : " + getName());
		System.out.println("* 계좌번호 : " + getAcnumber());
		System.out.println("* 잔액 : " + getBalance());
		System.out.println("**************************");
	}

}
