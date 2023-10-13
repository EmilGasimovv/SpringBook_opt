package com.example.springoptional.controller;

import com.example.springoptional.modul.Book;
import com.example.springoptional.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping()
    public List<Book> getAll(){
        return bookService.getAll();
    }
    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id){
        return bookService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        bookService.deleteById(id);
    }
    @PostMapping("/book")
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }

}
