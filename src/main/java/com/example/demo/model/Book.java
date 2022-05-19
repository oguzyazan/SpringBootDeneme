package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Book {
    @Id
    private String id;
    private String name;

    private String typeId;
    private String[] typeName;
    public Book(String id, String name, String typeId,String[] typeName) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.typeName = typeName;
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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String[] getTypeName() {
        return typeName;
    }

    public void setTypeName(String[] typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
