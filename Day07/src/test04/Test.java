package test04;

public class Test {
	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i+10);
		
		String s = i+""; // 이어붙이기는  연산자가 피연산자들을 살펴보고 숫자형인지 문자형인지 판단하게된다.
		
		System.out.println(s+10);
		
		int i2 = Integer.parseInt(s); // wrapper 클래스 의 parse자료형을 사용하면 문자열->숫자로 바꿀 수 있다!
		double d = Double.parseDouble(s);
		
		System.out.println(i2+10);
		System.out.println(d+10);
	}
}
