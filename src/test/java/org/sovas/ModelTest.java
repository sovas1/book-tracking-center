package org.sovas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sovas.model.Book;

public class ModelTest {

    Book book;

    @Before
    public void setup() throws Exception {
        book = new Book();

        book.setPages((short) 1000);
        book.setPagesRead((short) 200);

        book.calculateReadPercentage();
        book.calculatePagesRemaining();
    }

    @Test
    public void testBookReadPercentageCalculator() {
        Assert.assertEquals(20.0, book.getReadPercentage(), 0.0);
    }

    @Test
    public void testBookPagesRemainingCalculator() {
        Assert.assertEquals(800, book.getPagesRemaining(), 0.0);
    }

}
