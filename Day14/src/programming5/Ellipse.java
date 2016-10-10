package programming5;

public class Ellipse extends TwoDimshape {
	private int major_axis, minor_axis;
	
	public Ellipse(int x, int y, int major_axis, int minor_axis){
		super(x, y);
		this.major_axis = major_axis;
		this.minor_axis = minor_axis;
	}
	
	@Override
	public double getArea(){
		return (major_axis/2.0) * (minor_axis/2.0) * Math.PI;
	}

}
