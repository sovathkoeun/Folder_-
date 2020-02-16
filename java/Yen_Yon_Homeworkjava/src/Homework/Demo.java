package Homework;

import java.util.ArrayList;
import java.util.List;

import Homework.Book;

import java.util.Formatter;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("Don't Make me think", "Stev Krung", 2000  );
		book1.borrow();
		Book book2 = new Book("Pro Java Programming", "Terrill", 2005);
		book2.returnBack();
		Book book3 = new Book("The Clean Coder", "Mark Summerfield", 2005);
		book3.borrow();
		Book book4 = new Book("The Art of Agile Development", "Robert", 2011);
		book4.borrow();
		Book book5 = new Book("The Art of Agile Development", "James Shore", 2007);
		Book book6 = new Book("Head First Design Patterns", "Eric Freeman", 2004);
		Book book7 = new Book("The Linux Command Line", "Willian", 2009);
		book7.borrow();
		Book book8 = new Book("Code Complete", "Steve", 1993);
		Book book9 = new Book("Unit Test Patterns", "Gerard Meszaros", 2003);
		Book book10 = new Book("The C++ Programming Language", "Bjarne Stroustup", 2013);
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
		System.out.println();
		System.out.println("--- TABLE ---");
		
   // Create an Empty List of Student, And add few objects to the List
		
		List<Book> typeofbook = new ArrayList<>();

		typeofbook.add(book1);
		typeofbook.add(book2);
		typeofbook.add(book3);
		typeofbook.add(book4);
		typeofbook.add(book5);
		typeofbook.add(book6);
		typeofbook.add(book7);
		typeofbook.add(book8);
		typeofbook.add(book9);
		typeofbook.add(book10);

		// Print the list objects in tabular format.
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.printf("%30s %30s %10s %20s", "TITLE", "AUTHOR", "YEAR", "STATUS");
		System.out.println();
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		for (Book gettypeofbook : typeofbook) {
			System.out.format("%30s %30s %10s %20s", gettypeofbook.getTitle(), gettypeofbook.getAuthor(), gettypeofbook.getPublicYear(),
					gettypeofbook.isBorrowed());
			System.out.println();
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		
	}
}
