package programming6;

public class Novel extends Book {
	@Override
	public int getLateFees(int days) {
		return days * 300;
	}
}
