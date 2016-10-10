package example;

public class DateTest {
	public static void main(String[] args) {
		Date lamp = new Date();
		
		lamp.setDate(2011, "5¿ù", 13);
		lamp.printDate();
		lamp.setDate(2016, "9¿ù", 1);
		lamp.printDate();
	}
}
