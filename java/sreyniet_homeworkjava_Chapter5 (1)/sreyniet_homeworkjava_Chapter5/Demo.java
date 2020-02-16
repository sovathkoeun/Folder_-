package chapter5;

public class Demo {

	public static void main(String[] args) {
	
		
		Book book1 = new Book("Don't make me think","Steve Krung",2000);
		Book book2 = new Book("Pro java Programming","Terrill",2005);
		Book book3 = new Book("Programming in Python3 ","Mark Summerfield",2005);
		Book book4 = new Book("The Clean Coder","Robert",2011);
		Book book5 = new Book("The Art Of Agile Development","James Shore",2007);
		Book book6= new Book("Head First Design Patterns","Eric Freeman",2004);
		Book book7 = new Book("The Linux Command Line","Willian",2009);
		Book book8 = new Book("Code Complete","Steve",1993);
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		
		book1.borrow();
		book2.returnBack();
		book3.borrow();
		book4.borrow();
		book5.returnBack();
		book6.returnBack();
		book7.borrow();
		book8.returnBack();
		book9.returnBack();
		book10.borrow();
		
		
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		System.out.println(book6.toString());
		System.out.println(book7.toString());
		System.out.println(book8.toString());
		System.out.println(book9.toString());
		System.out.println(book10.toString());
	
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		
		String format= "%1$-30s %2$-20s %3$-10s %4$-15s\n";
		System.out.format(format,"TITLE","AUTHOR","YEAR","STATUS\t");
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.format(format,book1.getTitle(),book1.getAuthor(),book1.getPublishYear(),book1.isBorrowed());
		System.out.format(format,book2.getTitle(),book2.getAuthor(),book2.getPublishYear(),book2.isBorrowed());
		System.out.format(format,book3.getTitle(),book3.getAuthor(),book3.getPublishYear(),book3.isBorrowed());
		System.out.format(format,book4.getTitle(),book4.getAuthor(),book4.getPublishYear(),book4.isBorrowed());
		System.out.format(format,book5.getTitle(),book5.getAuthor(),book5.getPublishYear(),book5.isBorrowed());
		System.out.format(format,book6.getTitle(),book6.getAuthor(),book6.getPublishYear(),book6.isBorrowed());
		System.out.format(format,book7.getTitle(),book7.getAuthor(),book7.getPublishYear(),book7.isBorrowed());
		System.out.format(format,book8.getTitle(),book8.getAuthor(),book8.getPublishYear(),book8.isBorrowed());
		System.out.format(format,book9.getTitle(),book9.getAuthor(),book9.getPublishYear(),book9.isBorrowed());
		System.out.format(format,book10.getTitle(),book10.getAuthor(),book10.getPublishYear(),book10.isBorrowed());
		

	}

}

//List<Book> books = new ArrayList<Book>();
//
//books.add(new Book("srlsd"));
//
//System.out.println("--------------------------------------------------------------------------");
//
//String format= "%1$-30s %2$-20s %3$-10s %4$-15s\n";
//System.out.format(format,"TITLE","AUTHOR","YEAR","STATUS\t");
//
//System.out.println("----------------------------------------------------------------------------");
//
//for(Book books:book) {
//	String format= "%1$-30s %2$-20s %3$-10s %4$-15s\n",
//	book.getClass(),book);
//	System.out.println();
//}
//sout=============================


