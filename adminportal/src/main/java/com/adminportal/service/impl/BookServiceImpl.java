package com.adminportal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Book;
import com.adminportal.repository.BookRepository;
import com.adminportal.service.BookService;

@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	
	
	
	
	
	
	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
