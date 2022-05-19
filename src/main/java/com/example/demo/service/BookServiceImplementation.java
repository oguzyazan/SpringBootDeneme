package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImplementation implements BookService{
    private BookRepository bookRepository;

    @Autowired
    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll(){
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public List<Book> getAllVWBooks(){
        List<Book> books = new ArrayList<>();
        bookRepository.getVWBooks().forEach(books::add);
        return books;
    }
    @Override
    public Book save(Book book){
        bookRepository.save(book);
        return book;
    }
    @Override
    public boolean  delete(String id){
        try {
            bookRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return  false;
        }


    }

}
