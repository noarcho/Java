package programming5;

public class Cube extends ThreeDimshape {
	private int side;
	
	public Cube(int x, int y, int side) {
		super(x,y);
		this.side = side;
	}
	
	@Override
	public double getVolume(){
		return Math.pow(side, 3);
	}
}
