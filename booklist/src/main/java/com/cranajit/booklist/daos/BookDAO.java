package com.cranajit.booklist.daos;

import java.util.List;

import javax.transaction.Transactional;

import com.cranajit.booklist.models.Book;

@Transactional
public interface BookDAO {
	List<Book> getAllBooks();

	Book getBook(long id);

	Book addBook(Book book);

	Book updateBook(Book book);

	long deleteBook(long id);
}
