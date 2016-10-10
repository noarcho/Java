package test03;

import java.util.HashSet;
import java.util.Set;

public class test03 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"수면", "잠", "침대", "침대"};
		
		for(String a:sample){
			if(!s.add(a)) System.out.println("중복된 단어: " + a);
			
		}
		System.out.println(s.size() + " 중복되지 않은 단어: " + s);
	}
}
