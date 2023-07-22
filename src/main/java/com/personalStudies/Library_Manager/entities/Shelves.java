package com.personalStudies.Library_Manager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_shelves")
public class Shelves {
    private int qntBooks;
    private final int CAPACITY = 6;
    private String genre;

    // @ElementCollection
    // private List<Book> books = new LinkedList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Shelves() {
    }

    public int getQntBooks() {
        return qntBooks;
    }

    public void setQntBooks(int qntBooks) {
        this.qntBooks = qntBooks;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    /* public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    } */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
