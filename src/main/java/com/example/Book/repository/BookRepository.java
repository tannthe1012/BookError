package com.example.Book.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Book.entity.Book;
public interface BookRepository {
//	public List<Book> dataBookRepository();
	public void save(Book book);
}
