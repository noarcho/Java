package programming2;

import java.util.ArrayList;

public class MyMath<T> {
	ArrayList<T> arr = new ArrayList<>();

	public void add(T item) {
		arr.add(item);
	}

	public static <T extends Number> T getAverage(ArrayList<? super Integer> list) {
		<? super Integer> average = 0;
		T sum;
		for(int i = 0; i < list)
		
		return average;
	}
	
	public static void main(String[] args) {
		MyMath<Integer> m1 = new MyMath<>();
		MyMath<Integer> m2 = new MyMath<>();


		
	}
}


