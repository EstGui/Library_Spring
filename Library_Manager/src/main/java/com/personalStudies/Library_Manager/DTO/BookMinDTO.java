package com.personalStudies.Library_Manager.DTO;

import com.personalStudies.Library_Manager.entities.Book;

public class BookMinDTO {
    private String title, author, imgUrl;
    private double value;
    private Long id;
    
    public BookMinDTO(Book entity) {
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.imgUrl = entity.getImgUrl();
        this.value = entity.getValue();
        this.id = entity.getId();
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}