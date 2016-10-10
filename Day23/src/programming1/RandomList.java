package programming1;

import java.util.ArrayList;

public class RandomList<T> {
	ArrayList<T> arr = new ArrayList<>();

	public void add(T item) {
		arr.add(item);
	}

	public T select() {
		int random;
		random = (int)(Math.random() * arr.size());
		return arr.get(random);
	}
	
	public static void main(String[] args) {
		RandomList<String> rl = new RandomList<>();
		rl.add("안녕하세요");
		rl.add("반갑습니다");
		rl.add("즐거운 시간 보내세요");
		
		System.out.println(rl.select());
		System.out.println(rl.select());
		System.out.println(rl.select());
		System.out.println(rl.select());
		System.out.println(rl.select());
		System.out.println(rl.select());

		
	}
}


