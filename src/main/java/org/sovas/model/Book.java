package org.sovas.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private byte readPercentage;

    @Column
    private short pagesRemaining;


}
