package com.example.springoptional.service;

import com.example.springoptional.modul.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book getById(Long id);
    void deleteById(Long id);
    Book save(Book book);

}
