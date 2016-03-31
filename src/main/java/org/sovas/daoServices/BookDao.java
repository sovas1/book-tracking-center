package org.sovas.daoServices;

import org.sovas.model.Book;

import java.util.Set;

/**
 * Created by sowa on 31.03.2016.
 */
public interface BookDao {

    void add(Book book);

    Book update(Book book);

    void delete(Long id);

    Book get(Long id);

    Set<Book> getAll();

}
