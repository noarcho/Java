package programming4;

public class Point {
	private int x, y;
	
	public void set(int input_x, int input_y){
		x = input_x;
		y = input_y;
	}
	
	public void print(){
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("---------");
	}

}
