package com.personalStudies.Library_Manager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalStudies.Library_Manager.entities.Book;
import com.personalStudies.Library_Manager.repositories.IBookRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    
    @Autowired
    private IBookRepository bookRepository;

    @Transactional (readOnly = true)
    public List<Book> findAll() {
        List<Book> result = bookRepository.findAll();

        return result;
    }
}
