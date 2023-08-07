package com.personalStudies.Library_Manager.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.personalStudies.Library_Manager.entities.Book;
import org.springframework.data.jpa.repository.Query;

public interface IBookRepository extends JpaRepository<Book, Long>{
    List<Book> searchByGenre(String genre);
    List<Book> searchByAuthor(String author);
    List<Book> searchByTitle(String title);

    @Query("SELECT DISTINCT genre FROM Book genre")
    List<Book> findGenres();
}
