package com.personalStudies.Library_Manager.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.personalStudies.Library_Manager.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personalStudies.Library_Manager.DTO.BookMinDTO;
import com.personalStudies.Library_Manager.services.BookService;

@Controller
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public String findAll(Model model) {
        Map<String, List<BookMinDTO>> listGenres = new HashMap<>();
        List<BookMinDTO> allBooks = bookService.findAllDTO();
        List<Book> genresList = bookService.findGenres();

        for (Book genre : genresList) {
            List<BookMinDTO> genreBooks = bookService.searchByGen(genre.getGenre());

            listGenres.put(genre.getGenre(), genreBooks);
        }

        model.addAttribute("genres", listGenres);

        model.addAttribute("books", allBooks);

        return "index";
    }
}