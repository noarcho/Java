package test01;

public class Test {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setData(10);
		int result = (int) box.getData();	// 가져올때 형변환 사용
		System.out.println("박스에 담은 데이터:"+result);
		
		box.setData("Hello");
		String result2 = (String)box.getData();
		System.out.println("박스에 담은 데이터:"+result2);
///////////////////////////////////////////////////////////////////////
		// 잘못 활용한 경우(문자를 숫자로 바꿀수 없음)
		box.setData(100);
		box.setData("Java");
		int result3 = (int)box.getData();
		System.out.println("박스에 담은 데이터:"+result3);
	}
}
