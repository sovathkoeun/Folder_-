package homework;

public class Book {
	private String title;
	private String author;
	private boolean isBorrowed = false;
	private int publicYear;

	public Book(String title, String author, int publicYear) {
		this.title = title;
		this.author = author;
		this.publicYear = publicYear;

	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicYear() {
		return publicYear;
	}

	public String isBorrowed() {
		String cond;

		if (isBorrowed) {
			cond = "Not available";

		} else {
			cond = "Available";
		}
		return cond;
	}

// method
	void returnBack() {
		isBorrowed = false;
	}

	void borrow() {
		isBorrowed = true;
	}

	public String toString() {
		isBorrowed();
		return "Title: " + title + "\n by " + author + "--" + "published " + publicYear + "\n" + " Status: "
				+ isBorrowed() + " to borrow";

	}

}
