package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Book;

public interface Bookdao extends JpaRepository<Book,Integer> {
	

}
