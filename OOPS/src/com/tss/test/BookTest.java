package com.tss.test;

import java.util.Scanner;

import com.tss.model.Book;

public class BookTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Book book1 = new Book();
		Book book2 = new Book();

		System.out.println("Enter Book1 Details: ");
		setDetails(book1, scanner);
		System.out.println("--------------Book1 Details--------------");
		book1.display();

		System.out.println("Enter Book2 Details: ");
		setDetails(book2, scanner);
		System.out.println("--------------Book2 Details---------------");
		book2.display();
	}

	private static void setDetails(Book book, Scanner scanner) {
		System.out.print("Enter Book id: ");
		int bookId = scanner.nextInt();
		book.setBookId(bookId);
		scanner.nextLine();

		System.out.println("Enter Name Of Book: ");
		String name = scanner.nextLine();
		book.setBookName(name);

		System.out.println("Enter Name Of Author: ");
		String authorName = scanner.nextLine();
		book.setAuthorName(authorName);

		System.out.println("Enter Name Of Publication: ");
		String publicationName = scanner.nextLine();
		book.setPublication(publicationName);

		System.out.println("Enter The Price Of Book: ");
		double price = scanner.nextDouble();
		book.setPrice(price);

		book.setSellingPrice();
	}

}
