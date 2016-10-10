package programming6;

public class ScienceFiction extends Book {
	@Override
	public int getLateFees(int days) {
		return days * 600;
	}
}
