package programming4;

public class Person implements Comparable {
	private String name;
	private int height;

	public Person() {
		String name = null;
		height = 0;
	}
	
	public Person(String name, int height){
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		Person other = (Person) o;
		if (this.height > other.height)
			return 1;
		else if(this.height < other.height){
			return -1;
		}
		else
			return 0;
	}
	
	public String getMaximum(Person[] array){
		String Max_person = null;
		for(Person p:array){
			if(this.compareTo(p) == -1){
				this.name = p.name;
				this.height = p.height;
				Max_person = p.getName();
			}
		}
		return this.name;
	}
}
