package test04;

public class Test {
	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i+10);
		
		String s = i+""; // �̾���̱��  �����ڰ� �ǿ����ڵ��� ���캸�� ���������� ���������� �Ǵ��ϰԵȴ�.
		
		System.out.println(s+10);
		
		int i2 = Integer.parseInt(s); // wrapper Ŭ���� �� parse�ڷ����� ����ϸ� ���ڿ�->���ڷ� �ٲ� �� �ִ�!
		double d = Double.parseDouble(s);
		
		System.out.println(i2+10);
		System.out.println(d+10);
	}
}
