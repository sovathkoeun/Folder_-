package homework;

import java.util.ArrayList;
import java.util.List;

import java.util.Formatter;

public class Demo {

	public static void main(String[] args) {

		Book book1 = new Book("Don't Make me think", "Stev Krung", 2000);
		book1.borrow();
		Book book2 = new Book("Pro Java Programming", "Terrill", 2005);
		book2.returnBack();
		Book book3 = new Book("The Clean Coder", "Mark Summerfield", 2005);
		book3.borrow();
		Book book4 = new Book("The Art of Agile Development", "Robert", 2011);
		book4.borrow();
		Book book5 = new Book("The Art of Agile Development", "James Shore", 2007);
		book5.returnBack();;
		Book book6 = new Book("Head First Design Patterns", "Eric Freeman", 2004);
		book6.returnBack();;
		Book book7 = new Book("The Linux Command Line", "Willian", 2009);
		book7.borrow();
		Book book8 = new Book("Code Complete", "Steve", 1993);
		book8.returnBack();
		Book book9 = new Book("Unit Test Patterns", "Gerard Meszaros", 2003);
		book9.returnBack();
		Book book10 = new Book("The C++ Programming Language", "Bjarne Stroustup", 2013);
		book10.borrow();

		System.out.println();
		System.out.println();
		System.out.println("--- TABLE ---");

		// Create an Empty List of Student, And add few objects to the List

		List<Book> students = new ArrayList<Book>();

		students.add(book1);
		students.add(book2);
		students.add(book3);
		students.add(book4);
		students.add(book5);
		students.add(book6);
		students.add(book7);
		students.add(book8);
		students.add(book9);
		students.add(book10);

		// Print the list objects in tabular format.
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		System.out.printf("%30s %30s %10s %30s", "TITLE", "AUTHOR", "YEAR", "STATUS");
		System.out.println();
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		for (Book student : students) {
			System.out.format("%30s %30s %10s %30s", student.getTitle(), student.getAuthor(), student.getPublicYear(),
					student.isBorrowed());
			System.out.println();
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
		Students student = new Students("yon", "WEP2020A");
		student.returnBook(book2);
		student.borrowedBook(book2);

		System.out.println(student);
		System.out.println(book2.getTitle());

		System.out.println(book5.getTitle());
		System.out.println(book6.getTitle());


		// Print the list objects in tabular format.
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");
	}
}
