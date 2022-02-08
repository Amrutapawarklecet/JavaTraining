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
	public void addBook(@RequestBody Book book) {
		bookservice.addBook(book);

	}
	
	@PutMapping("/{bookId}")
	public void updateBook(@RequestBody Book book, @PathVariable String bookId) {
		bookservice.updateBook(book,Integer.parseInt(bookId));
	}

	@DeleteMapping("/{bookId}")
	public void deleteBook(@PathVariable String bookId) {
		bookservice.deleteBook(Integer.parseInt(bookId));
	}
	
	@GetMapping("/{bookId}")
	public Book getBookById(@PathVariable String bookId) {
		Book bookDetails=bookservice.getBookById(Integer.parseInt(bookId));
		return bookDetails;

	} 

	@GetMapping("/")
	public List<Book> getAllBook() {
		List<Book> allBooksList=bookservice.getAllBook();
 		return allBooksList;
		
	}
}
