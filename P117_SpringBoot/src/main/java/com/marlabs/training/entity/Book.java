package com.marlabs.training.entity;

public class Book {

	private long bookId;
	private String title;
	private double price;
	private String authorName;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book(long bookId, String title, double price, String authorName) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", authorName=" + authorName + "]";
	}
	
}
