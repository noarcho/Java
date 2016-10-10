package test02;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String[] words = {"banana", "apple", "tomato", "orange"};
		
		words[0] = "pineapple";	// 기존 배열의 특정 항목 변경 가능
		words[4] = "grape"; // 배열의 현재 유호 인덱스는 0-3까지만 가능
		
		List<String> wordList = Arrays.asList(words);
		wordList.add("grape");
		
		System.out.println("리스트 크기:"+wordList.size());
	}
}
