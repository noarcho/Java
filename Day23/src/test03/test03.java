package test03;

import java.util.HashSet;
import java.util.Set;

public class test03 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"����", "��", "ħ��", "ħ��"};
		
		for(String a:sample){
			if(!s.add(a)) System.out.println("�ߺ��� �ܾ�: " + a);
			
		}
		System.out.println(s.size() + " �ߺ����� ���� �ܾ�: " + s);
	}
}
