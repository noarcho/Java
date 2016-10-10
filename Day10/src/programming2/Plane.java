package programming2;

public class Plane {
	private String manufacturer, model;
	private int max_passenger;
	private static int planes = 0;
	
	public Plane(){
		planes++;
	}
	
	public Plane(String manufacturer, String model, int max_passenger){
		setManufacturer(manufacturer);
		setModel(model);
		setMax_Passenger(max_passenger);
		planes++;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMax_Passenger(int max_passenger) {
		this.max_passenger = max_passenger;
	}
	
	public String getManufacturer(){
		return manufacturer;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getMax_Passenger(){
		return max_passenger;
	}
	
	public static int getPlanes(){
		return planes;
	}
}
