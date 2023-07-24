package com.personalStudies.Library_Manager.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalStudies.Library_Manager.entities.Book;

public interface IBookRepository extends JpaRepository<Book, Long>{
    List<Book> searchByGenre(String genre);
}
