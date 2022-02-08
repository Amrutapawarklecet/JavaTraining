/*wap to add book details
bookid,name,author name,price
1.Add a Book to the db
2.Delete a book
3.Search for a book use case and switch and scanner class to take user input.
*/

package com.marlabs.training.entity;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {
	

   @Id
   //@GeneratedValue
   @Column(name="bid")
	private int bookid;
   
   @Column(name="bname")
	private String bookname;
   
   @Column(name="aname")
	private String authorname;
	
	private double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String bookname, String authorname, double price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.price = price;
	}

	public Book(String bookname, String authorname, double price) {
		super();
		this.bookname = bookname;
		this.authorname = authorname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", price=" + price
				+ "]";
	}
	
	



   
}
