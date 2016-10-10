package programming5;

public class Triangle extends TwoDimshape {
	private int width, height;
	
	public Triangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea(){
		return width * height / 2.0;
	}
}
