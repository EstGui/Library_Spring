package com.personalStudies.Library_Manager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalStudies.Library_Manager.DTO.BookDTO;
import com.personalStudies.Library_Manager.DTO.BookMinDTO;
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

    @Transactional (readOnly = true)
    public List<BookMinDTO> findAllDTO() {
        List<Book> result = bookRepository.findAll();

        return result.stream().map(BookMinDTO::new).toList();
    }

    @Transactional (readOnly = true)
    public BookDTO bookInformation(Long id) {
        Book result = bookRepository.findById(id).get();

        return new BookDTO(result);
    }

    @Transactional (readOnly = true)
    public List<BookMinDTO> searchByGen(String genre) {
        List<Book> result = bookRepository.searchByGenre(genre);

        return result.stream().map(BookMinDTO::new).toList();
    }
}
