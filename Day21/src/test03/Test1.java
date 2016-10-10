package test03;

import java.util.StringTokenizer;

public class Test1 {
	public static void main(String[] args) {
		String s = "aa bb c_ddd e ee_ff";
		
		StringTokenizer  st = new StringTokenizer(s, "_", true);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
