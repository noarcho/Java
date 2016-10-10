package test03;

public class Student implements Comparable {
	private double grade;
	private String name;
	private String studentNum;
	private String phone;

	public Student(double g, String num, String p, String n) {
		this.name = n;
		this.studentNum = num;
		this.phone = p;
		this.grade = g;
	}
	
	

	@Override
	public int compareTo(Object other) {
		
		System.out.println("test");
		if (this.grade > ((Student) other).grade)
			return 1;
		else if (this.grade < ((Student) other).grade)
			return -1;
		else
			return 0;
	}

}
