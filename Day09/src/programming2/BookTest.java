package programming2;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setTitle("�巡�����");
		book.setAuthur("�̿���");
		
		System.out.println("���� : " + book.getTitle());
		System.out.println("���� : " + book.getAuthur());
	}

}