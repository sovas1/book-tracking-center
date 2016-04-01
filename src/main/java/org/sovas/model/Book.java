package org.sovas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String title;

    @Column
    private short pages;

    @Column
    private short pagesRead;

    @Column
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private double readPercentage;

    @Column
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private short pagesRemaining;

    // methods

    public void calculateReadPercentage() {
        readPercentage = ( (double) pagesRead / (double) pages ) * 100.0;
    }

    public void calculatePagesRemaining() {
        pagesRemaining = (short) (pages - pagesRead);
    }

}
