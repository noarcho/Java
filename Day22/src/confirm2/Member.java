package confirm2;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//���⿡ �ڵ带 �ۼ��ϼ���.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ": " + name;
	}
}
