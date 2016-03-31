package org.sovas.daoServices;

import org.sovas.model.Book;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookDaoImpl implements BookDao{

    @Override
    public void add(Book book) {

    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Book get(Long id) {
        return null;
    }

    @Override
    public Set<Book> getAll() {
        return null;
    }

}
