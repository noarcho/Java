package middle_test;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40};
		
		for( int i = 0; i < 4; i++)
			System.out.println(array[i]);
		
		for(int n:array){
			System.out.println(n);
		}
		
		// 전통적인 for 루프는 3항(초기화; 조건; 증감)을 쓰는 대신 for each는 두항(변수:배열)만을 쓴다.
		// 일반 for 루프는 조건을 지정해줘야하지만 for each는 배열의 끝까지 자동으로 계속 돌아가게 된다.

	}
}