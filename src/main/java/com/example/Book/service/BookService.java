package com.example.Book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Book.entity.Book;
public interface BookService {
//	public List<Book> dataService();
	
	public void save(Book book);
}
