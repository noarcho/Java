package test02;

public class Test {
	public static void main(String[] args) {
		// ���ڿ� ���� �ڽ� ���(���ʸ�)
		Box<String> box = new Box<String>();
		box.setData("Hello");
		String result = box.getData();
		System.out.println("�ڽ��� ���� ������:"+result);
		
		//	box.setData(100);
		//	int result2 = (int)box.getData();
		//	�߸��� �ڷ����� ������ �����Ϸ����� erroró����
		
		// ������ ���� �ڽ� ���
		Box<Integer> box2 = new Box<Integer>();
		box2.setData(100);
		int result3 = box2.getData();
		System.out.println("�ڽ��� ���� ������:"+result3);
	}

}
