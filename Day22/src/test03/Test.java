package test03;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(100);
		intList.add(10);
		intList.add(868);
		intList.add(78);
		intList.add(3);
		
		System.out.println("intList�� ũ��:"+intList.size());
		System.out.println("intList�� 2�� ����:"+intList.get(2));
		System.out.println(intList);
		
		intList.remove(1);
		System.out.println("1�� ������ intList�� ũ��:"+intList.size());
		System.out.println("1�� ������ intList�� 2�� ����:"+intList.get(2));
		System.out.println(intList);
		
		
	}
}