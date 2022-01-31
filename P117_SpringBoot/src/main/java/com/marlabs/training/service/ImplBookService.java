package com.marlabs.training.service;

import java.util.*;

import com.marlabs.training.entity.Book;

public interface ImplBookService {

	//post
	public void addBook(Book book);
	
	//update
	public void updateBook(Book book,int bookId);
	
	//delete
	public boolean deleteBook(int bookId);

	//get by id
	public Book getBookById(int bookId);

	//get all
	public List<Book> getAllBook();

}
