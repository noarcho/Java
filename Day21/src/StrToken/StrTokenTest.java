package StrToken;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;


public class StrTokenTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer st, st1;
		String[] strarray;
		String str;
		int cnt = 0;
		
		System.out.print("문자열을 입력하시요:");
		str = scan.nextLine();
		st = new StringTokenizer(str, ".");
		while(st.hasMoreTokens()){
			st1 = new StringTokenizer(st.nextToken(), " ");
			while(st1.hasMoreTokens()){
				System.out.println(st1.nextToken());
				cnt++;
			}
		}
		
		System.out.println("모두 " + cnt + "개의 단어가 있습니다.");
		
		strarray = new String[cnt];
		
		cnt = 0;
		
		st = new StringTokenizer(str, ".");
		while(st.hasMoreTokens()){
			st1 = new StringTokenizer(st.nextToken(), " ");
			while(st1.hasMoreTokens()){
				strarray[cnt] = new String(st1.nextToken());
				cnt++;
			}
		}
		

		Arrays.sort(strarray);
		
		System.out.println("------------------------------------");
		System.out.println("정렬된 단어는 다음과 같습니다.");
		
		for(int i = 0 ; i < cnt ; i++){
			System.out.println(strarray[i]);
		}
	}

}