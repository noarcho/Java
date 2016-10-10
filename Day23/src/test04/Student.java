package test04;

public class Student {
	int number;
	String name;
	
	public Student(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
