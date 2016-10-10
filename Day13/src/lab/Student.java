package lab;

import javax.security.auth.Subject;

public class Student extends Human{
	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		System.out.println("Student ������!");
		this.major = major;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return super.toString() + ", ���� : " + major;
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
		Student s1 = new Student("����", 21, "��ǻ��");
		Student s2 = new Student("����", 22, "�濵");
		Student s3 = new Student("����", 24, "����");
		
		//s1.name = "ȫ�浿";
		//s1.age = 1;
		//protected�� public�� �ڽ� Ŭ������ Student����
		//������ �����ϳ� private�� ���� �� �� ����.
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(s1.getProfession());
	}
	
}
