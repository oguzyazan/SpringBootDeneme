package com.example.demo.controller;

import com.example.demo.model.BookType;
import com.example.demo.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/BookType")
public class
BookTypeController {

    @Autowired
    private BookTypeService bookTypeService;

    public BookTypeController(BookTypeService bookTypeService) {
        this.bookTypeService = bookTypeService;
    }

    @GetMapping(value="/getAll")
    public List<BookType> getAllBookTypes(){
        return bookTypeService.getAll();
    }

    @PostMapping(value = "/insert")
    public BookType save(@RequestBody BookType book){
        return bookTypeService.save(book);
    }
    @DeleteMapping(value = "/delete")
    public boolean  delete(@RequestParam String id){
         return bookTypeService.delete(id);
    }
}
