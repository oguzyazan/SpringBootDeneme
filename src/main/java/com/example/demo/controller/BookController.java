package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/book")
public class
BookController {

    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value="/getAll")
    public List<Book> getAllVote(){
        return bookService.getAll();
    }

    @PostMapping(value = "/insert")
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }
    @DeleteMapping(value = "/delete")
    public boolean  delete(@RequestParam String id){
         return bookService.delete(id);
    }
}
