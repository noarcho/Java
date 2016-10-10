package programming5;

public class Cylinder extends ThreeDimshape {
	private int radius, height;
	
	public Cylinder(int x, int y, int radius, int height) {
		super(x,y);
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double getVolume(){
		return Math.pow(radius, 2) * Math.PI * height;
	}
}
