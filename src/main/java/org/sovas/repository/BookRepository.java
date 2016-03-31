package org.sovas.repository;

import org.sovas.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

/**
 * Created by sowa on 31.03.2016.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("from Book")
    Set<Book> getAllBooks();

}
