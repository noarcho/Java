package test01;

public class Test {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setData(10);
		int result = (int) box.getData();	// �����ö� ����ȯ ���
		System.out.println("�ڽ��� ���� ������:"+result);
		
		box.setData("Hello");
		String result2 = (String)box.getData();
		System.out.println("�ڽ��� ���� ������:"+result2);
///////////////////////////////////////////////////////////////////////
		// �߸� Ȱ���� ���(���ڸ� ���ڷ� �ٲܼ� ����)
		box.setData(100);
		box.setData("Java");
		int result3 = (int)box.getData();
		System.out.println("�ڽ��� ���� ������:"+result3);
	}
}
