package programming6;

public class Test {
	public static void main(String[] args) {
		Novel novel = new Novel();
		Poet poet = new Poet();
		ScienceFiction sf = new ScienceFiction();
		
		novel.setNumber("113515");
		novel.setTitle("드래곤라자");
		novel.setAuthor("이영도");
		
		poet.setNumber("332425");
		poet.setTitle("윤동주시집");
		poet.setAuthor("윤동주");
		
		sf.setNumber("113515");
		sf.setTitle("듄 1");
		sf.setAuthor("프랭크 허버트");
		
		
		System.out.println("번호 : " + novel.getNumber());
		System.out.println("제목 : " + novel.getTitle());
		System.out.println("저자 : " + novel.getAuthor());
		System.out.println("연체료 : " + novel.getLateFees(4));
		
		System.out.println("번호 : " + poet.getNumber());
		System.out.println("제목 : " + poet.getTitle());
		System.out.println("저자 : " + poet.getAuthor());
		System.out.println("연체료 : " + poet.getLateFees(5));
		
		System.out.println("번호 : " + sf.getNumber());
		System.out.println("제목 : " + sf.getTitle());
		System.out.println("저자 : " + sf.getAuthor());
		System.out.println("연체료 : " + sf.getLateFees(2));
		
		System.out.println(novel.equals(poet));
		System.out.println(novel.equals(sf));
		
	}
}
