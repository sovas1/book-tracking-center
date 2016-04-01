package org.sovas.controller;

import org.sovas.daoServices.BookDao;
import org.sovas.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookDao bookDao;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public @ResponseBody Book add(@RequestBody Book book) { return bookDao.add(book); }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public @ResponseBody Book get(@PathVariable Long id) { return bookDao.get(id); }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public @ResponseBody List<Book> getAll() { return bookDao.getAll(); }


    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/book/{id}/{pagesRead}", method = RequestMethod.PUT)
    public @ResponseBody Book updatePagesRead(@PathVariable Long id, @PathVariable short pagesRead) {
        return bookDao.update(id, pagesRead);
    }

}