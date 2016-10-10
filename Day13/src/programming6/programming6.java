package programming6;

public class programming6 {
	public static void main(String[] args) {
		Phone p1 = new Phone("Samsung", 1000000, "LTE");
		SmartPhone s1 = new SmartPhone("Apple", 1010100, "LTE", "OS X", 10.0, 64, true,	true);
		
		System.out.println(p1.getManufacturer());
		System.out.println(p1.getPrice());
		System.out.println(p1.getCommuniType());
		System.out.println("======================");
		System.out.println(s1.getManufacturer());
		System.out.println(s1.getPrice());
		System.out.println(s1.getCommuniType());
		System.out.println(s1.getOsType());
		System.out.println(s1.getOsVersion());
		System.out.println(s1.getMemorySize());
		System.out.println(s1.isCamera());
		System.out.println(s1.isBluetooth());
	}
}

class Phone {
	private String manufacturer;
	private int price;
	private String communiType;
	
	public Phone(String manufacturer, int price, String communiType) {
		this.manufacturer = manufacturer;
		this.price = price;
		this.communiType = communiType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCommuniType() {
		return communiType;
	}

	public void setCommuniType(String communiType) {
		this.communiType = communiType;
	}
}

class SmartPhone extends Phone {
	private String osType;
	private double osVersion;
	private int memorySize;
	private boolean isCamera;
	private boolean isBluetooth;
	
	public SmartPhone(String manufacturer, int price, String communiType, String osType, double osVersion,
			int memorySize, boolean isCamera, boolean isBluetooth) {
		super(manufacturer, price, communiType);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memorySize = memorySize;
		this.isCamera = isCamera;
		this.isBluetooth = isBluetooth;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public double getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(double osVersion) {
		this.osVersion = osVersion;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public boolean isCamera() {
		return isCamera;
	}

	public void setCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public boolean isBluetooth() {
		return isBluetooth;
	}

	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}
	
	
}