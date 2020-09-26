package com.example.Book.repository.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Book.entity.Book;
import com.example.Book.repository.BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository{
	private EntityManager em;
//	@Override
//	public List<Book> dataBookRepository() {
//		List<Book> list = new ArrayList<Book>();
//		Book book1 = new Book("Tren Duong Bang", 12001);
//		Book book2 = new Book("The Gioi Dong Vat", 12002);
//		list.add(book1);
//		list.add(book2);
//		return list;
//	}
	@Autowired
	public BookRepositoryImpl(EntityManager em) {
		this.em = em;
	}
	@Override
	public void save(Book book) {
		em.persist(book);
	}
}
