package com.marlabs.training.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.marlabs.training.entity.Book;
import com.marlabs.training.service.BookService;

@RestController
@RequestMapping("/Book")
public class BookController {

	@Autowired
	private BookService bookservice;
	
	
	@PostMapping("/")
	public void addBook(Book book) {
		Book b4 = new Book(4,"Spring Core", 700.00, "Sandip");
		bookservice.addBook(b4);

	}
	
	@PutMapping("/bookId")
	public void updateBook(Book book,int bookId) {
		bookservice.updateBook(book, bookId);
	}

	@DeleteMapping("/bookId")
	public void deleteBook(int bookId) {
	}
	
	@GetMapping("/bookId")
	public Book getBookById(int bookId) {
		return bookservice.getBookById(bookId);
	} 

	@GetMapping("/")
	public List<Book> getAllBook() {
		List<Book> books=bookservice.getAllBook();
 		return books;
		
	}
}
