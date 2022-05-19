package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.VWBook;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {


   /* @Aggregation(pipeline = {
            "{'$lookup':  {'from':  'bookType', 'localField': 'typeId', 'foreignField':  '_id', 'as':  'typeName'}}"
    })*/
    @Aggregation(pipeline = {
            "{'$match': { 'name': 'Oguz Kaan Yazan' }}"
    })
    List<VWBook> getVWBooks();
}
