package test02;

public class Test {
	public static void main(String[] args) {
		// 문자열 저장 박스 사용(제너릭)
		Box<String> box = new Box<String>();
		box.setData("Hello");
		String result = box.getData();
		System.out.println("박스에 담은 데이터:"+result);
		
		//	box.setData(100);
		//	int result2 = (int)box.getData();
		//	잘못된 자료형을 넣을시 컴파일러에서 error처리함
		
		// 정수형 저장 박스 사용
		Box<Integer> box2 = new Box<Integer>();
		box2.setData(100);
		int result3 = box2.getData();
		System.out.println("박스에 담은 데이터:"+result3);
	}

}
