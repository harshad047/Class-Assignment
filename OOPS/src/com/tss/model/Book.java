package com.tss.model;

public class Book {
	private int bookId;
	private String bookName;
	private String authorName;
	private String publication;
	private double price;
	private double sellingPrice;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSellingPrice() {
		this.sellingPrice = price * 0.9;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void display() {
		System.out.println("Book id: " + this.bookId);
		System.out.println("Book Name: " + this.bookName);
		System.out.println("Author Name: " + this.authorName);
		System.out.println("Publication Name: " + this.publication);
		System.out.println("Original Book Price: " + this.price);
		System.out.println("Discounted Book Price: " + this.sellingPrice);
	}
}
