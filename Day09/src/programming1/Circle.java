package programming1;

public class Circle {
	private int r, cx, cy; // r : ������, cx, cy : ���� �߽� ��ǥ

	public double area() {
		return r * r * 3.14;
	}

	public void setRadius(int input_r) {
		r = input_r;
	}

	public void setPointX(int input_cx) {
		cx = input_cx;
	}

	public void setPointY(int input_cy) {
		cy = input_cy;
	}
	
	public int getRadius(){
		return r;
	}
	
	public int getPointX(){
		return cx;
	}
	
	public int getPointY(){
		return cy;
	}
}
