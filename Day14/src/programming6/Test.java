package programming6;

public class Test {
	public static void main(String[] args) {
		Novel novel = new Novel();
		Poet poet = new Poet();
		ScienceFiction sf = new ScienceFiction();
		
		novel.setNumber("113515");
		novel.setTitle("�巡�����");
		novel.setAuthor("�̿���");
		
		poet.setNumber("332425");
		poet.setTitle("�����ֽ���");
		poet.setAuthor("������");
		
		sf.setNumber("113515");
		sf.setTitle("�� 1");
		sf.setAuthor("����ũ ���Ʈ");
		
		
		System.out.println("��ȣ : " + novel.getNumber());
		System.out.println("���� : " + novel.getTitle());
		System.out.println("���� : " + novel.getAuthor());
		System.out.println("��ü�� : " + novel.getLateFees(4));
		
		System.out.println("��ȣ : " + poet.getNumber());
		System.out.println("���� : " + poet.getTitle());
		System.out.println("���� : " + poet.getAuthor());
		System.out.println("��ü�� : " + poet.getLateFees(5));
		
		System.out.println("��ȣ : " + sf.getNumber());
		System.out.println("���� : " + sf.getTitle());
		System.out.println("���� : " + sf.getAuthor());
		System.out.println("��ü�� : " + sf.getLateFees(2));
		
		System.out.println(novel.equals(poet));
		System.out.println(novel.equals(sf));
		
	}
}
