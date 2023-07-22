package com.personalStudies.Library_Manager.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    
    @EmbeddedId
    private BelonginPK id = new BelonginPK();
    private Integer position;

    public Belonging(Book book, Shelves shelve, Integer position) {
        this.id.setBook(book);
        this.id.setShelve(shelve);
        this.position = position;
    }

    public BelonginPK getId() {
        return id;
    }

    public void setId(BelonginPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
