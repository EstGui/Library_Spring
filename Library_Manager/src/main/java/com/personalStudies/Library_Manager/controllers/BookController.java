package com.personalStudies.Library_Manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personalStudies.Library_Manager.DTO.BookMinDTO;
import com.personalStudies.Library_Manager.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public String findAll(Model model) {
        List<BookMinDTO> result = bookService.findAllDTO();

        model.addAttribute("books", result);

        return "index";
    }
}