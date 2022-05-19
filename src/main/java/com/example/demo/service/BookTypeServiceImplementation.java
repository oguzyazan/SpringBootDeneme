package com.example.demo.service;

import com.example.demo.model.BookType;
import com.example.demo.repository.BookTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookTypeServiceImplementation implements BookTypeService{
    private BookTypeRepository bookTypeRepository;

    @Autowired
    public BookTypeServiceImplementation(BookTypeRepository bookTypeRepository) {
        this.bookTypeRepository = bookTypeRepository;
    }

    @Override
    public List<BookType> getAll(){
        List<BookType> bookTypes = new ArrayList<>();
        bookTypeRepository.findAll().forEach(bookTypes::add);
        return bookTypes;
    }


    @Override
    public BookType save(BookType bookType){
        bookTypeRepository.save(bookType);
        return bookType;
    }
    @Override
    public boolean  delete(String id){
        try {
            bookTypeRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return  false;
        }


    }
}
