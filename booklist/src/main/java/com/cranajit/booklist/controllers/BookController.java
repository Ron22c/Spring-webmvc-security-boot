package com.cranajit.booklist.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cranajit.booklist.models.Book;
import com.cranajit.booklist.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

	@ResponseBody
	@RequestMapping(value = "/book/{id}")
	public Book getBook(@PathVariable long id) {
		return bookService.getBook(id);
	}
}
