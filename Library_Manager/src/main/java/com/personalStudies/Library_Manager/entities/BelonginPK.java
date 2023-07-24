package com.personalStudies.Library_Manager.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelonginPK {

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "shelve_id")
    private Shelves shelve;

    public BelonginPK() {
    }

    public BelonginPK(Book book, Shelves shelve) {
        this.book = book;
        this.shelve = shelve;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Shelves getShelve() {
        return shelve;
    }

    public void setShelve(Shelves shelve) {
        this.shelve = shelve;
    }
}
