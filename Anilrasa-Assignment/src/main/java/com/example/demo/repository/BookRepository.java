package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Author;
import com.example.demo.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthorId(Long authorId);
    
    // Custom query to find books published after a certain year
    @Query("SELECT b FROM Book b WHERE b.publishDate > :year")
    List<Book> findBooksPublishedAfterYear(int year);

    // Custom query to find authors who have written more than N books
    @Query("SELECT a FROM Author a WHERE SIZE(a.books) > :bookCount")
    List<Author> findAuthorsWithMoreThanNBooks(int bookCount);

	Book save(Author author);
}
