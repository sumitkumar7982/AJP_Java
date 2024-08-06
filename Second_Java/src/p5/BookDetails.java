package p5;

import java.util.ArrayList;

class Book {
	int bookId;
	String bookName;
	String authorName;

	public Book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.authorName = authorName;
		this.bookName = bookName;
	}

}

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(1, "Java Programming", "John Doe"));
		books.add(new Book(2, "Python Programming", "Jane Smith"));
		books.add(new Book(3, "Data Structures and Algorithms", "Alice Johnson"));

		// Display all book details using enhanced for loop
		System.out.println("All Books Details:");

		for (Book book : books) {
			System.out.println("Book ID: " + book.bookId);
			System.out.println("Book Name: " + book.bookName);
			System.out.println("Author Name: " + book.authorName);
			System.out.println(); // Empty line for better readability
		}

	}

}
