package test04;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		LinkedList<String> strList = new LinkedList<>();
		
		strList.add("jsp");
		strList.add("spring");
		strList.add("java");
		strList.add("android");
		strList.add("oracle");
		
		System.out.println("strList�� ������:"+strList.size());
		System.out.println("strList�� 2�� ����:"+strList.get(2));
		System.out.println(strList);
		
		strList.remove(1);
		System.out.println("1�� ������ strList�� ������:"+strList.size());
		System.out.println("1�� ������ strList�� 2�� ����:"+strList.get(2));
		System.out.println(strList);
		
		
		
	}
}
