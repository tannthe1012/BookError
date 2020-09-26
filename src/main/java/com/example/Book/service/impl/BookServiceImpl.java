package com.example.Book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Book.entity.Book;
import com.example.Book.repository.BookRepository;
import com.example.Book.service.BookService;
import java.util.List;

import javax.transaction.Transactional;

@Service
public class BookServiceImpl implements BookService{
	private BookRepository bookRepository;
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
//	@Override
//	public List<Book> dataService(){
//		return  (List<Book>) bookRepository.dataBookRepository();
//	}
	
	@Override
	@Transactional
	public void save(Book book) {
		bookRepository.save(book);
	}
	
	
}
