package org.sovas.repository;

import org.sovas.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("from Book")
    List<Book> getAllBooks();

}
