package lab;

import javax.security.auth.Subject;

public class Student extends Human{
	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		System.out.println("Student 생성자!");
		this.major = major;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return super.toString() + ", 전공 : " + major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String getProfession() {
		// TODO Auto-generated method stub
		return this.major;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("명진", 21, "컴퓨터");
		Student s2 = new Student("미현", 22, "경영");
		Student s3 = new Student("용준", 24, "경제");
		
		//s1.name = "홍길동";
		//s1.age = 1;
		//protected와 public은 자식 클래스인 Student에서
		//접근이 가능하나 private는 접근 할 수 없다.
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(s1.getProfession());
	}
	
}
