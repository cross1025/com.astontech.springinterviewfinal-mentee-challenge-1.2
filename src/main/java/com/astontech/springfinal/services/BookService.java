package com.astontech.springfinal.services;

import com.astontech.springfinal.domain.Book;

public interface BookService {

     void saveNewBook (Book book);
     public Iterable<Book> listAllBooks();

}
