package com.cranajit.booklist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cranajit.booklist.daos.BookDAO;
import com.cranajit.booklist.models.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDAO bookDAO;

	@Override
	public List<Book> getAllBooks() {
		return null;
	}

	@Override
	public Book getBook(long id) {
		return bookDAO.getBook(id);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long deleteBook(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
