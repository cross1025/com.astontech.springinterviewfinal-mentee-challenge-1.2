package com.astontech.springfinal.domain;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @Column(name = "isbn")
    private String isbn;


    private String author;

    private String name;

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
