package programming3;

public class Test<T> {

	public void a(T t) {

		System.out.println(t.getClass().getName());
	}
	
	public static void main(String[] args) {
		Test t = new Test<>();
		int a1 = 0;
		float f1 = (float) 12.412;

		
		t.a(a1);
		// java.lang.Integer
		t.a(f1);
		// java.lang.Float
		


	}
}


