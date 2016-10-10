package test03;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		Student[] student = new Student[5];
		student[0] = new Student(3.2, "a", "113101", "010-999-9999");
		student[1] = new Student(2.5, "b", "113101", "010-999-9999");
		student[2] = new Student(3, "c", "113101", "010-999-9999");
		student[3] = new Student(4.5, "d", "113101", "010-999-9999");
		student[4] = new Student(1.5, "e", "113101", "010-999-9999");
		
		Arrays.sort(student);
		
		System.out.println(student[1]);
	}
}
