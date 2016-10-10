package programming4;

public class programming4 {
	public static void main(String[] args) {
		Book b1 = new Book("반지의 제왕", 1000, "J.R.R. 톨킨");
		Magazine m1 = new Magazine("이밥차", 150, "이밥차 편집부", "2016-9-7");
		System.out.println(b1.getAuthur());
		System.out.println(b1.getPage());
		System.out.println(b1.getTitle());
		System.out.println("======================");
		System.out.println(m1.getAuthur());
		System.out.println(m1.getPage());
		System.out.println(m1.getRelease_date());
		System.out.println(m1.getTitle());
	}
}

class Book {
	private String title;
	private int page;
	private String authur;
		
	public Book(String title, int page, String authur) {
		this.title = title;
		this.page = page;
		this.authur = authur;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthur() {
		return authur;
	}
	public void setAuthur(String authur) {
		this.authur = authur;
	}
	
	
}
class Magazine extends Book{
	private String release_date;
	
	public Magazine(String title, int page, String authur, String release_date) {
		super(title, page, authur);
		this.release_date = release_date;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
}