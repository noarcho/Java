package test02;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String[] words = {"banana", "apple", "tomato", "orange"};
		
		words[0] = "pineapple";	// ���� �迭�� Ư�� �׸� ���� ����
		words[4] = "grape"; // �迭�� ���� ��ȣ �ε����� 0-3������ ����
		
		List<String> wordList = Arrays.asList(words);
		wordList.add("grape");
		
		System.out.println("����Ʈ ũ��:"+wordList.size());
	}
}
