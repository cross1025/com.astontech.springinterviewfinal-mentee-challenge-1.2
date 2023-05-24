package com.astontech.springfinal.services.impl;


import com.astontech.springfinal.domain.Book;
import com.astontech.springfinal.repositories.BookRepository;
import com.astontech.springfinal.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    public void saveNewBook(Book book) {
        bookRepository.save(book);
    }
//    public List<Book> listAllBooks() {
//        List<Book> newBookList = new ArrayList<>();
//        for(Book b : bookRepository.findAll()) {
//            newBookList.add(b);
//        }

    public Iterable<Book> listAllBooks() {
        return bookRepository.findAll();

        }
    }



