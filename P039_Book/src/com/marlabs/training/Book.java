package com.marlabs.training;

public class Book {
	String book_id;
	String book_name;
	String price;

	public Book(String book_id, String book_name, String price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", price=" + price + "]";
	}
}
