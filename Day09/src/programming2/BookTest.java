package programming2;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setTitle("드래곤라자");
		book.setAuthur("이영도");
		
		System.out.println("제목 : " + book.getTitle());
		System.out.println("저자 : " + book.getAuthur());
	}

}
