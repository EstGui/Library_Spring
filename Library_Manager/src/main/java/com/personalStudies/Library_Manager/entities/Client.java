package com.personalStudies.Library_Manager.entities;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clients")
public class Client {
    private String name, account, phone;

    @ElementCollection
    private List<Book> rentedBooks;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Client() {
    }

    public Client(String name, String account, String phone, Long id) {
        this.name = name;
        this.account = account;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
