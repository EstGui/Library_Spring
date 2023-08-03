package com.personalStudies.Library_Manager.DTO;

import com.personalStudies.Library_Manager.entities.Book;

public class BookMinDTO {
    private String title, author, imgUrl;
    private Long id;

    public BookMinDTO(Book entity) {
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.imgUrl = entity.getImgUrl();
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}