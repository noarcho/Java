package programming5;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setname("����");
		employee.setphone("010-0001-1234");
		employee.setsalary(3000);
		
		System.out.println("��� �̸� " + employee.getname());
		System.out.println("��ȭ ��ȣ " + employee.getphone());
		System.out.println("���� " + employee.getsalary());
		
		
		
	}

}
