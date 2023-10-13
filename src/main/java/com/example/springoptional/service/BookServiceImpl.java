package com.example.springoptional.service;

import com.example.springoptional.Exception.ExceptionTest;
import com.example.springoptional.modul.Book;
import com.example.springoptional.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;
    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
    @Override
    public Book getById(Long id) {
     Optional<Book> optBook= bookRepository.findById(id);
     if(optBook.isPresent()){
         return optBook.get();
     }
     else {
         return optBook.orElseThrow(()->new ExceptionTest("Book not found"));
     }
    }

    @Override
    public void deleteById(Long id) {
    bookRepository.deleteById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
