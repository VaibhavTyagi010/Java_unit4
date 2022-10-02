package com.demo.service;

import java.util.List;

import com.demo.entity.Book;

public interface BookService {
	
	
	public Book saveBook(Book book);
	public Book updateBook(Book book,Integer id);
	public Book deleteBook(Integer id);
	public Book BookbyId(Integer id);
	public List<Book> allBook();
	

}
