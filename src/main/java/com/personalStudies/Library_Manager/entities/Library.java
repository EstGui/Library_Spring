package com.personalStudies.Library_Manager.entities;

public class Library {
    private final String NAME = "Storyland";
    private final int CAPACITY = 20;
    /* private List<Book> books = new ArrayList<>();
    private Map<Integer, Client> clients = new TreeMap<>(); */

    /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; */

    public String getNAME() {
        return NAME;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    /* public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<Integer, Client> getClients() {
        return clients;
    }

    public void setClients(Map<Integer, Client> clients) {
        this.clients = clients;
    } */
}
