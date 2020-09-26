package com.example.Book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book.entity.Book;
import com.example.Book.service.BookService;

@RestController
@RequestMapping("/tan1")
public class BookController {
	private BookService bookService;
	@Autowired
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}
	
//	@GetMapping
//	public List<Book> dataController() {
//		return (List<Book>) bookService.dataService();
//	}
	@GetMapping("/tan")
	public Book saveBook() {
		Book book = new Book();
		book.setName("Tan");
		book.setId(12);
		bookService.save(book);
		return book;
	}
}
