package programming5;

public class programming5 {
	public static void main(String[] args) {
		Food f1 = new Food(150, 100, 1);
		Melon m1 = new Melon(75, 5000, 2, "∏·∑–≥Û¿Â");
		
		System.out.println(f1.getCalorie());
		System.out.println(f1.getPrice());
		System.out.println(f1.getWeight());
		System.out.println("======================");
		System.out.println(m1.getCalorie());
		System.out.println(m1.getPrice());
		System.out.println(m1.getWeight());
		System.out.println(m1.getFarm());
	}
}

class Food {
	private int calorie;
	private int price;
	private int weight;
	public Food(int calorie, int price, int weight) {
		super();
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}

class Melon extends Food {
	private String Farm;

	public Melon(int calorie, int price, int weight, String farm) {
		super(calorie, price, weight);
		Farm = farm;
	}

	public String getFarm() {
		return Farm;
	}

	public void setFarm(String farm) {
		Farm = farm;
	}
	
}
