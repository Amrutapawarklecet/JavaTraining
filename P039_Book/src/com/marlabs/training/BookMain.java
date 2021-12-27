package com.marlabs.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		HashMap<String, Book> hm = new HashMap<String, Book>();
		Book b1 = new Book("100", "Art of War", "1000");
		Book b2 = new Book("101", "The element of style", "2000");
		Book b3 = new Book("102", "Poke the Box", "3000");
		Book b4 = new Book("103", "A Christmas Carol", "4000");
		hm.put("100", b1);
		hm.put("101", b2);
		hm.put("102", b3);
		hm.put("104", b4);
		System.out.println("The total Book list is");
		for (Map.Entry<String, Book> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		Scanner ob = new Scanner(System.in);
		System.out.println("To sold the book press a. to increase price press b. to search the book press c");
		int choice = ob.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the book id to sold");
			String bookid = ob.nextLine();
			for (Map.Entry<String, Book> m : hm.entrySet())
				if (m.getKey().equals(bookid)) {
					hm.remove(bookid);
					System.out.println("The" + m.getValue() + " is sold");
					System.exit(1);
				} else {
					System.out.println("The book is not present");
				}
			System.out.println("The total Book list is");
			for (Map.Entry<String, Book> m : hm.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		case 2:
			System.out.println("Enter the book id,name and price to increase");
			Scanner ob1 = new Scanner(System.in);
			String bookid1 = ob1.nextLine();
			String name1 = ob1.nextLine();
			String price = ob1.nextLine();
			Book b = new Book(bookid1, name1, price);
			hm.replace(bookid1, b);
			System.out.println("The total Book list is");
			for (Map.Entry<String, Book> m : hm.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
			break;
		case 3:
			System.out.println("Enter the book id to Search");
			Scanner ob2 = new Scanner(System.in);
			String bookid2 = ob2.nextLine();
			System.out.println(bookid2);
			int x = 0;
			for (Map.Entry<String, Book> m : hm.entrySet()) {
				if (m.getKey().equals(bookid2)) {
					x = 1;
				} else {
				}
			}
			if (x == 1)
				System.out.println("Book is present");
			else {
				System.out.println("Book is not present");
			}
		}
	}
}
