package com.cranajit.booklist.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 CREATE TABLE books (bookId int AUTO_INCREMENT PRIMARY KEY, bookName varchar(30), bookDescription varchar(30), author varchar(30));      
 INSERT INTO books VALUES (1, 'Troubled Blood', 'Thriller', 'J. K. Rowling'); 
 */

@Entity(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookId")
	private long bookId;
	
	@Column(name = "bookName")
	private String bookName;
	
	@Column(name = "bookDescription")
	private String bookDescription;
	
	@Column(name = "author")
	private String author;

	public Book() {
	}

	public Book(long bookId, String bookName, String bookDescription, String author) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.author = author;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookDescription=" + bookDescription
				+ ", author=" + author + "]";
	}
}
