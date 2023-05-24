package com.astontech.springfinal.repositories;

import com.astontech.springfinal.domain.Book;
import org.springframework.data.repository.CrudRepository;



public interface BookRepository extends CrudRepository<Book, String> {
}
