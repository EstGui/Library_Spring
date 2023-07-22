package com.personalStudies.Library_Manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalStudies.Library_Manager.entities.Book;

public interface IBookRepository extends JpaRepository<Book, Long>{
    
}
