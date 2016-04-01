package org.sovas;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.sovas.controller.BookController;
import org.sovas.daoServices.BookDao;
import org.sovas.model.Book;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class RestApiTest {

    @InjectMocks
    private BookController bookController;

    @Mock
    private BookDao bookDao;

    private MockMvc mockMvc;
    private Book book;
    byte[] book2json; // byte json

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();

        book = mockBook();
        book2json = toJson(book);
    }


    @Test
    public void testPost() throws Exception {
        mockMvc.perform(post("/book")
                .content(book2json)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andReturn();

    }

    @Test
    public void testGet() throws Exception {
        mockMvc.perform(get("/book/" + book.getId()))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetAll() throws Exception {
        mockMvc.perform(get("/book"))
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdatePagesRead() throws Exception {
        short newPagesRead = 500;
        mockMvc.perform(put("/book/" + book.getId() + "/" + newPagesRead ))
                .andExpect(status().isAccepted());
    }

    @Test
    public void testDelete() throws Exception {
        mockMvc.perform(delete("/book/" + book.getId()))
                .andExpect(status().isGone());
    }


    // methods

    private Book mockBook() {
        Book book = new Book();
        book.setId(1L);
        book.setAuthor("test author");
        book.setTitle("test title");
        book.setPages((short) 1000);
        book.setPagesRead((short) 200);
        return book;
    }

    private byte[] toJson(Object book) throws Exception {
        ObjectMapper map = new ObjectMapper();
        return map.writeValueAsString(book).getBytes();
    }

}
