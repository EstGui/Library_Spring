package com.personalStudies.Library_Manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalStudies.Library_Manager.DTO.BookDTO;
import com.personalStudies.Library_Manager.DTO.BookMinDTO;
import com.personalStudies.Library_Manager.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookMinDTO> findAll() {
        List<BookMinDTO> result = bookService.findAllDTO();
        
        return result;
    }

    @GetMapping (value = "/{id}")
    public BookDTO bookInformation(@PathVariable Long id) {
        BookDTO result = bookService.bookInformation(id);

        return result;
    }

    @GetMapping (value = "/genre/{genre}")
    public List<BookMinDTO> searchByGenre(@PathVariable String genre) {
        List<BookMinDTO> result = bookService.searchByGen(genre);

        return result;
    }
}