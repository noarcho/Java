package programming3;

public class Dice {
	private int face;

	public int roll() {
		face = (int) (Math.random() * 6) + 1;
		return face;
	}

}
