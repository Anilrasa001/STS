package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Optional<Book> getAllBooksByAuthor(Long authorId) {
        return bookRepository.findById(authorId);
    }

    public List<Book> getBooksPublishedAfterYear(int year) {
        return bookRepository.findBooksPublishedAfterYear(year);
    }

    public List<Author> getAuthorsWithMoreThanNBooks(int bookCount) {
        return bookRepository.findAuthorsWithMoreThanNBooks(bookCount);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
