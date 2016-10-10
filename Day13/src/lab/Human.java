package lab;

public class Human {
	private String name;
	private int age;
	//protected String name;
	//protected int age;
	//public String name;
	//public int age;
	
	public Human(String name, int age) {
		System.out.println("Human »ı¼ºÀÚ!");
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ÀÌ¸§ : " + name + ", ³ªÀÌ : " + age + "¼¼";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getProfession(){
		return null;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human("ÃáÇâ", 18);
		Human h2 = new Human("¸ù·æ", 21);
		Human h3 = new Human("»ç¶Ç", 50);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}
