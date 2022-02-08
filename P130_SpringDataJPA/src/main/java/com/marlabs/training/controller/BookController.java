package com.marlabs.training.controller;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.marlabs.training.entity.Book;
import com.marlabs.training.repository.BookRepository;

@Component
public class BookController implements CommandLineRunner {
	@Autowired
	private BookRepository repo;
		
	@Override
	public void run(String... args) throws Exception {
		int bookid ;
		String bookname = null;
		String author = null;
		double price;

		Scanner ob = new Scanner(System.in);
		System.out.println(
				"please enter ur choice:\n" + "1 for save\n" + "2 for update\n"+"3 for search\n"+ "4 for delete\n");
		int choice = ob.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("enter bookid,bookname,author,price");
			bookid = ob.nextInt();
			bookname = ob.next();
			author = ob.next();
			price = ob.nextDouble();
				repo.save(new Book(bookid,bookname,author,price));
				System.out.println(repo.count());
			break;


		case 2:
			System.out.println("enter bookid,bookname,author,price");
			bookid = ob.nextInt();
			bookname = ob.next();
			author = ob.next();
			price = ob.nextDouble();
				repo.save(new Book(bookid,bookname,author,price));
				System.out.println(repo.count());
			break;

			
	case 3:
		System.out.println("enter bookid");
		bookid = ob.nextInt();
		Optional<Book> opt=repo.findById(bookid);
		if(opt.isPresent()) {
			Book b=opt.get();
			System.out.println(b);
		}
		break;
	case 4:
		System.out.println("enter bookid");
		bookid = ob.nextInt();
		repo.deleteById(bookid);
		break;

		
	}

}
}
