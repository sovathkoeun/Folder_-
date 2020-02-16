package chapter5;

public class Book {
	private String title;
	private String author;
	private int publishYear;
	private boolean isBorrowed = true;
	String year;
	
	
	
	public Book() {
		
	}
	
	
	
	public String getTitle() {
		return title;
	}
	
	public Book (String title,String author,int publishYear) {
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	
	}
	

	public String getAuthor() {
		return author;
	}
	
	public int getPublishYear() {
		return publishYear;
	}
	// title	
	void borrow() {
		 isBorrowed=true;
	}
	 
	void returnBack() {
		isBorrowed=false;
	}
	
	boolean isBorrowed() {
		return isBorrowed;
	}
	
	
	
	
	 public String  toString() {
		 String textStatus;
		 if(isBorrowed) {
			 textStatus = "Not available to Borrow";
		 }else {
			 textStatus= "Available to Borrow";
		 }
			 
		 return "Title: " + title + "\n\t by " + author + "--published " + publishYear + "\n\t Status: "+ textStatus ; 
	 
}
}

