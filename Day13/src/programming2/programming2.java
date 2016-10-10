package programming2;

public class programming2 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", "����Ư����", "010-1234-5678");
		Customer c1 = new Customer("�Ӳ���", "�λ걤����", "010-9999-9999", "00001", 120);
		
		System.out.println("p1�� �̸� : " + p1.getName());
		System.out.println("p1�� �ּ� : " + p1.getAddress());
		System.out.println("p1�� ��ȭ ��ȣ : " + p1.getPhone());
		System.out.println("======================");
		System.out.println("c1�� �̸� : " + c1.getName());
		System.out.println("c1�� �ּ� : " + c1.getAddress());
		System.out.println("c1�� ��ȭ ��ȣ : " + c1.getPhone());
		System.out.println("c1�� �� ��ȣ : " + c1.getCsNumber());
		System.out.println("c1�� ���ϸ��� : " + c1.getMileage());
	}
}

class Person {
	private String name;
	private String address;
	private String phone;
		
	public Person(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

class Customer extends Person {
	private String csNumber;
	private int mileage;
			
	public Customer(String name, String address, String phone, String csNumber, int mileage) {
		super(name, address, phone);
		this.csNumber = csNumber;
		this.mileage = mileage;
	}
	
	public String getCsNumber() {
		return csNumber;
	}
	public void setCsNumber(String csNumber) {
		this.csNumber = csNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
}