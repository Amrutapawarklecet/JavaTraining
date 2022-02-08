package com.marlabs.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.marlabs.training.entity.Book;

@Component
public class BookService implements ImplBookService {

	private static List<Book> books = new ArrayList<Book>();
	static {
		Book b1 = new Book(1, "Core Java", 300.00, "Afreen");
		Book b2 = new Book(2, "Advance Java", 600.00, "Abhilasha");
		Book b3 = new Book(3, "Spring Boot", 800.00, "Amruta");
		books.add(b1);
		books.add(b2);
		books.add(b3);
	}

	@Override
	public void addBook(Book book) {
		books.add(book);
	}

	@Override
	public void updateBook(Book book, int bookId) {
		Book record=getBookById(bookId);
		books.remove(record);
		book.setBookId(bookId);
		books.add(book);
	}

	@Override
	public boolean deleteBook(int bookId) {
		Book record=getBookById(bookId);
		books.remove(record);
		return Boolean.TRUE;
	}

	@Override
	public Book getBookById(int bookId) {
		
		return books.stream().filter(b ->b.getBookId() == bookId).findFirst().get();
	}

	@Override
	public List<Book> getAllBook() {
		
		return books;
	}

}
