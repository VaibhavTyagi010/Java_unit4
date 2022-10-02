package com.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Book;
import com.demo.repo.Bookdao;



@Service
public class BookImp implements BookService {
     
	
	@Autowired
	private Bookdao bd;
	
	
	
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		
		
		return bd.save(book);
	}

	@Override
	public Book updateBook(Book book,Integer id) {
		
		Book b1 =null;
		try {
			b1 = bd.findById(id).orElseThrow(() -> new Exception("Customer with ID "+id+" does not exit.."));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			 b1.setAuthor(book.getAuthor());
			 b1.setName(book.getName());
			 b1.setCategory(book.getCategory());
			 b1.setPages(book.getPages());
			 b1.setPrice(book.getPrice());
		  
			 
		return bd.save(b1);
	}

	@Override
	public Book deleteBook(Integer id) {
		// TODO Auto-generated method stub
		
		Book ct =null;
		try {
			ct = bd.findById(id).orElseThrow(() -> new Exception("Customer with ID "+id+" does not exit.."));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 bd.deleteById(id);
		
		return ct;
				
	
	}

	@Override
	public Book BookbyId(Integer id) {
		
Book ct =null;
try {
	ct = bd.findById(id).orElseThrow(() -> new Exception("Customer with ID "+id+" does not exit.."));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
		return ct;
		
	}

	@Override
	public List<Book> allBook() {
		
		return bd.findAll();
	}

}
