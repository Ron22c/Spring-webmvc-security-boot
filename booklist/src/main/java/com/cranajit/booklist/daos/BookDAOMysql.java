package com.cranajit.booklist.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cranajit.booklist.models.Book;

@Repository
@Transactional
public class BookDAOMysql implements BookDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Book> getAllBooks() {
		return null;
	}

	@Override
	public Book getBook(long id) {
		return sessionFactory.getCurrentSession().get(Book.class, id);
	}

	@Override
	public Book addBook(Book book) {
		//sessionFactory.
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
