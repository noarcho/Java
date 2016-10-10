package programming6;

public class Poet extends Book {
	@Override
	public int getLateFees(int days) {
		return days * 200;
	}
}
