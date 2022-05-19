package com.example.demo.service;

import com.example.demo.model.BookType;

import java.util.List;

public interface BookTypeService {
    List<BookType> getAll();
    BookType save(BookType book);
    boolean delete(String id);
}
