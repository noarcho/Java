package programming4;

public class Test4 {
	public static void main(String[] args) {
		Person[] array = new Person[4];
		Person person = new Person();
		
		array[0] = new Person("������",165);
		array[1] = new Person("�󸶹�",200);
		array[2] = new Person("�����",198);
		array[3] = new Person("��īŸ",186);
		
		System.out.println(person.getMaximum(array));
		
	}

}
