package programming2;

public class PlainTest {
	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		Plane p3 = new Plane();
		
		p1.getManufacturer();
		p1.setManufacturer("에어버스");
		p2.getMax_Passenger();
		p2.setMax_Passenger(500);
		p3.getModel();
		p3.setModel("A380");
		
		
		System.out.println(p3.getPlanes());
		System.out.println(p2.getPlanes());
		System.out.println(p1.getPlanes());
	}
}
