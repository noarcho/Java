package programming5;

public class Rectangle extends TwoDimshape {
	private int width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea(){
		return width * height;
	}
}
