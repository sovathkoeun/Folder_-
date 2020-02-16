package Homework;

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

	// getTitle
	public String getTitle() {
		return title;
	}

	// getAuthor
	public String getAuthor() {
		return author;
	}

	// getPublicYear
	public int getPublicYear() {
		return publicYear;
	}
	// isBorrowed()

	public String isBorrowed() {
		String Status;

		if (isBorrowed) {
			Status = "Not available";

		} else {
			Status = "Available";
		}
		return Status;
	}

	// method
	void returnBack() {
		isBorrowed = false;
	}

	void borrow() {
		isBorrowed = true;
	}

	// toString function
	public String toString() {
//		 isBorrowed();
		return "Title: " + title + "\n by " + author + "--" + "published " + publicYear + "\n" + " Status: "
				+ isBorrowed() + " to borrow";
	}
}
