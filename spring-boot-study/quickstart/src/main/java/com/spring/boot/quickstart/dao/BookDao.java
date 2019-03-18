package com.spring.boot.quickstart.dao;

import com.spring.boot.quickstart.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookDao {
    public List<Book> getBook(){
        List<Book> books =new ArrayList<>();
        books.add(new Book(1,"SpringDao实战",88.7));
        books.add(new Book(2,"SpringDao实战",89.7));
        books.add(new Book(3,"SpringDao实战",28.7));
        return books;
    }
}
