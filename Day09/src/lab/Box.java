package lab;

public class Box {
	private int width;
	private int length;
	private int height;

	public void setWidth(int input_width) {
		width = input_width;
	}

	public void setLength(int input_length) {
		length = input_length;
	}

	public void setHeight(int input_height) {
		height = input_height;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}
	
	public int getVolume() {
		return width * length * height;
	}
	
	public void print(){
		System.out.println("가로 : " + getWidth() + ", 세로 : " + getLength() + ", 높이 : " + getHeight());
	}

}
