package org.sovas.daoServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sovas.model.Book;
import org.sovas.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDaoImpl implements BookDao{

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book add(Book book) {
        log.debug("Book {} saved successfully", book);
        book.calculateReadPercentage();
        book.calculatePagesRemaining();
        return bookRepository.save(book);
    }

    @Override
    public Book update(Long id, short pagesRead) {

        Book book = bookRepository.findOne(id);

        book.setPagesRead(pagesRead);
        book.calculateReadPercentage();
        book.calculatePagesRemaining();

        log.debug("Book pagesRead updated successfully to {}", book.getPagesRead());
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public void delete(Long id) {
        log.debug("Book deleted successfully");
        bookRepository.delete(id);
    }

    @Override
    public Book get(Long id) {
        log.debug("Get Book run successfully");
        return bookRepository.findOne(id);
    }

    @Override
    public List<Book> getAll() {
        log.debug("Get All Books run successfully");
        return bookRepository.findAll();
    }

}
