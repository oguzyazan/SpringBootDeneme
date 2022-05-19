package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTypeRepository extends MongoRepository<BookType, String> {
}
