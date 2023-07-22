package com.personalStudies.Library_Manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalStudies.Library_Manager.entities.Book;
import com.personalStudies.Library_Manager.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        List<Book> result = bookService.findAll();
        
        return result;
    }
}