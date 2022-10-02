package com.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Book;
import com.demo.service.BookImp;


@RestController
public class BookCon {
	
	@Autowired
	BookImp bi;
	
	
	@GetMapping("/books")
	public List<Book> book()
	{
		return bi.allBook();
	}
	@GetMapping("/book/{Id}")
	public Book bookid(@PathVariable("Id") Integer id)
	{
	
		return bi.BookbyId(id);
	}
	@PostMapping(value="/save")
	public Book addBook(@RequestBody Book book)
	{
		return bi.saveBook(book);
	}
	
	@PutMapping("/update/{Id}")
	public Book updateStudent(@RequestBody Book book ,@PathVariable("Id")Integer id )
	{
		
		return bi.updateBook(book,id);
	}
	
    @DeleteMapping("/book/{Id}")
	public Book delete(@PathVariable("Id") Integer id)
	{
		return bi.deleteBook(id);
	}
}
