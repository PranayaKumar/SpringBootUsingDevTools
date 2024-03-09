package com.springboot.devtool.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.springboot.devtool.entity.Book;
@Component
public class BookService {
	
	private static List<Book> list = new  ArrayList<>();
	
	static {
		
		list.add(new Book(12,"reference book","xyz"));
		list.add(new Book(13,"reference book for java","ABC"));
		list.add(new Book(14,"reference book for DSA","DSA12"));
	}
	public List<Book> getAllBooks(){
		
		return list;
	}
	//get single book by id
	public  Book getBookById(int id){
		
		Book book = null;
		book =list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
				
	}
	//adding the book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	public void deleteBooid(int bId) {
		
		// TODO Auto-generated method stub
		list.stream().filter(book ->{
			if(book.getId()!=bId) {
				return true;
			}
			return false;
			
		}).collect(Collectors.toList());
	}

}
