package com.personalStudies.Library_Manager.controllers;

import com.personalStudies.Library_Manager.DTO.BookDTO;
import com.personalStudies.Library_Manager.DTO.BookMinDTO;
import com.personalStudies.Library_Manager.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/{id}")
    public BookDTO bookInformation(@PathVariable Long id) {
        BookDTO result = bookService.bookInformation(id);

        return result;
    }

    @GetMapping (value = "/genre/{genre}")
    public List<BookMinDTO> searchByGenre(@PathVariable String genre) {
        List<BookMinDTO> result = bookService.searchByGen(genre);

        return result;
    }

    @GetMapping (value = "/title/{title}")
    public List<BookMinDTO> searchByTitle(@PathVariable String title) {
        List<BookMinDTO> result = bookService.searchByTitle(title);

        return result;
    }

    @GetMapping (value = "/author/{author}")
    public List<BookMinDTO> searchByAuthor(@PathVariable String author) {
        List<BookMinDTO> result = bookService.searchByAuthor(author);

        return result;
    }
}
