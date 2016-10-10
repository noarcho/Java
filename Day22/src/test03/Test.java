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
		
		System.out.println("intList의 크기:"+intList.size());
		System.out.println("intList의 2번 원소:"+intList.get(2));
		System.out.println(intList);
		
		intList.remove(1);
		System.out.println("1번 삭제후 intList의 크기:"+intList.size());
		System.out.println("1번 삭제후 intList의 2번 원소:"+intList.get(2));
		System.out.println(intList);
		
		
	}
}