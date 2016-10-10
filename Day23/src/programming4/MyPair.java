package programming4;

public class MyPair<T> {
	T a;
	T b;
	
	public MyPair(T a, T b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + a + ", " + b + "]";
	}

	public static void main(String[] args) {
		MyPair<String> fruit = new MyPair<String>("사과", "포도");
		System.out.println(fruit.toString());
	}
}


