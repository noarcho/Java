package test08;

public class BankAccount {
	private String name, acnumber, passwd;
	private int balance;
	
	public BankAccount(String name, String acnumber,
						String passwd, int balance){
		this.name = name;
		this.acnumber = acnumber;
		this.passwd = passwd;
		this.balance = balance;
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
	}
	
	public void withdraw(int balance){
		if(this.balance >= balance){
			this.balance -= balance;
		}
		else {
		}
	}
	
	public void transfer(BankAccount sendac, int balance){
		if(this.balance >= balance){
			this.balance -= balance;
			sendac.setBalance(sendac.getBalance()+balance);
		}
		else {
		}
	}
	
	public void print(){
		System.out.println("**********��������**********");
		System.out.println("* ������ : " + getName());
		System.out.println("* ���¹�ȣ : " + getAcnumber());
		System.out.println("* �ܾ� : " + getBalance());
		System.out.println("**************************");
	}

}
