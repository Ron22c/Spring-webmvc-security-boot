package com.cranajit.booklist.services;

import java.util.List;

import com.cranajit.booklist.models.Book;

public interface BookService {

	List<Book> getAllBooks();

	Book getBook(long id);

	Book addBook(Book book);

	Book updateBook(Book book);

	long deleteBook(long id);

}
