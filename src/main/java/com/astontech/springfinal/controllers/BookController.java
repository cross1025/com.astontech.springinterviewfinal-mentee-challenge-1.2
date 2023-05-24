package com.astontech.springfinal.controllers;


import com.astontech.springfinal.domain.Book;
import com.astontech.springfinal.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book/addBook/", method = RequestMethod.GET)
    public String bookAddGet(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @RequestMapping(value = "/book/addBook/", method = RequestMethod.POST)
    public String bookAddPost(Model model, Book book) {
        bookService.saveNewBook(book);
        return "add-book";
    }

    @RequestMapping(value = "/book/viewBook/", method = RequestMethod.GET)
    public String viewBook(Model model) {
        model.addAttribute("books", bookService.listAllBooks());
    }



}
