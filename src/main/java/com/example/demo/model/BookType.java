package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class BookType {
    @Id
    private String id;
    private String name;

    public BookType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
