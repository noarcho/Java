package programming3;

public class Box {
	private int length, weight, height;
	private boolean empty = true;
	
	public Box(){
		this.length = 0;
		this.weight = 0;
		this.height = 0;
	}
	
	public Box(int length, int weight, int height){
		this.length = length;
		this.weight = weight;
		this.height = height;
	}
}
