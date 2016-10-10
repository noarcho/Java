package programming6;

public class Book {
	private String number, title, author;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book)
			return number.equals(((Book)obj).number);
		else
			return false;
	}

	public int getLateFees(int days) {
		return 0;
	}
}
