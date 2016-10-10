package test03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[] array = { 9, 6, 5, 4, 2, 1 };
		Arrays.sort(array);
		printArray(array);
		System.out.println(Arrays.binarySearch(array, 9));
		Arrays.fill(array, 8);
		printArray(array);

	}

	private static void printArray(int[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
}
