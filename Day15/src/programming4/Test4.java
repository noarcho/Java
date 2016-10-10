package programming4;

public class Test4 {
	public static void main(String[] args) {
		Person[] array = new Person[4];
		Person person = new Person();
		
		array[0] = new Person("가나다",165);
		array[1] = new Person("라마바",200);
		array[2] = new Person("사아자",198);
		array[3] = new Person("차카타",186);
		
		System.out.println(person.getMaximum(array));
		
	}

}
