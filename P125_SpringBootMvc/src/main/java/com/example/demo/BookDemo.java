package com.example.demo;



public class BookDemo {

private String bookid;
private String bookname;
private String author;
private String price;
public String getBookid() {
	return bookid;
}
public void setBookid(String bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public BookDemo(String bookid, String bookname, String author, String price) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.author = author;
	this.price = price;
}
public BookDemo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BookDemo [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
}


}