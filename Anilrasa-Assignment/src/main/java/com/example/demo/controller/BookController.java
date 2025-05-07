package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/post")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/author/{authorId}")
    public Optional<Book> getAllBooksByAuthor(@PathVariable Long authorId) {
        return bookService.getAllBooksByAuthor(authorId);
    }

    @GetMapping("/publishedAfter/{year}")
    public List<Book> getBooksPublishedAfterYear(@PathVariable int year) {
        return bookService.getBooksPublishedAfterYear(year);
    }

    @GetMapping("/MoreThan/{bookCount}")
    public List<Author> getAuthorsWithMoreThanNBooks(@PathVariable int bookCount) {
        return bookService.getAuthorsWithMoreThanNBooks(bookCount);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}

