package com.mgil.projects.booksapi.controllers;

import com.mgil.projects.booksapi.dtos.BasicApiResponse;
import com.mgil.projects.booksapi.models.Book;
import com.mgil.projects.booksapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BasicApiResponse<Book> getBook(@PathVariable long bookId) {
        Optional<Book> book  = bookService.getBook(bookId);
        BasicApiResponse<Book> response = new BasicApiResponse<>();
        book.ifPresent(response::setPayloadResponse);
        return response;
    }

}
