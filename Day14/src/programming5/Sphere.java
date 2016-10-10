package programming5;

public class Sphere extends ThreeDimshape {
	private int radius;
	
	public Sphere(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public double getVolume(){
		return (4.0 / 3.0) * Math.pow(radius, 3) * Math.PI;
	}
}
