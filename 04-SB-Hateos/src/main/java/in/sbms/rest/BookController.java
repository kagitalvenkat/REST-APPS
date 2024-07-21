package in.sbms.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.sbms.data.Book;

@RestController
public class BookController {
	
	@GetMapping(value ="/book/{isbn}" )
	public Book getBookInfo(@PathVariable String isbn) {
		Book book = new Book(isbn, "CORE JAVA", 450.55, "RUDRA");
		Link booksLink = WebMvcLinkBuilder.linkTo(
				WebMvcLinkBuilder.methodOn(BookController.class)
				.getAllBooks())
				.withRel("ALL-BOOKS");
		book.add(booksLink);
		
		return book;		
	}
	
	@GetMapping(value="/books",produces = "application/json")
	public List<Book> getAllBooks(){
		Book book1 = new Book("ISBN0001", "CORE JAVA", 450.55, "RUDRA");
		Book book2 = new Book("ISBN0002", "J2EE", 125.00, "SANTHOSH");
		Book book3 = new Book("ISBN0003", "SPRING BOOT", 150.45, "JOHNNY");
		Book book4 = new Book("ISBN0004", "RESTFUL", 100.44, "PAVAN");
		Book book5 = new Book("ISBN0005", "MICRO SERVICES", 750.55, "ASHOK");
		
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		return books;
	}

}
