package middle_test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		
		int[] array1 = {10, 20, 30, 40};
		int[] array2 = new int[array1.length];
		
		//얕은 복사 : 둘다 같은 주소값을 가르킨다
		
		int[] array3 = array1;
		
		//깊은 복사 : 두개가 다른 주소값을 가르킨다.
		for(int i = 0; i<array1.length;i++)
			array2[i] = array1[i];
		
		array2 = new int[array1.length];
		
		for(int n:array2){
			array1[n] = array2[n];
			}
		
		// 전통적인 for 루프는 3항(초기화; 조건; 증감)을 쓰는 대신 for each는 두항(변수:배열)만을 쓴다.
		// 일반 for 루프는 조건을 지정해줘야하지만 for each는 배열의 끝까지 자동으로 계속 돌아가게 된다.

	}
}