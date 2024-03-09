package com.springboot.devtool.controllers;

import com.springboot.devtool.entity.Book;
import com.springboot.devtool.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {
	//@RequestMapping(value ="/books",method=RequestMethod.GET)
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/books")


	public List<Book> getBooks() {

		return this.bookService.getAllBooks();
	}
	
	
	@GetMapping("/books/{id}")
	public Book getBooks(@PathVariable("id")int id) {
		return bookService.getBookById(id);
		
	}
	//add new book
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
     Book b=  this.bookService.addBook(book);
		return b;
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId")int bookId) {
		
	   this.bookService.deleteBooid(bookId);
		
	}
	
    /*
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,PathVariable("bookId")int bookId)
	*/
	
	}
	

	

	
		
		
	
	


