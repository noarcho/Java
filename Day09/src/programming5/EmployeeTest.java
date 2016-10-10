package programming5;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setname("김사원");
		employee.setphone("010-0001-1234");
		employee.setsalary(3000);
		
		System.out.println("사원 이름 " + employee.getname());
		System.out.println("전화 번호 " + employee.getphone());
		System.out.println("연봉 " + employee.getsalary());
		
		
		
	}

}
