package org.sovas.daoServices;

import org.sovas.model.Book;

import java.util.List;

/**
 * Created by sowa on 31.03.2016.
 */
public interface BookDao {

    Book add(Book book);

    Book update(Book book);

    void delete(Long id);

    Book get(Long id);

    List<Book> getAll();

}
