package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.model.VWBook;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book save(Book book);
    boolean delete(String id);
    List<VWBook> getAllVWBooks();
}
