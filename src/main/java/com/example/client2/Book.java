package com.example.client2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String book;
    Integer rating;

    public Book(Long id, String book, Integer rating) {
        this.id = id;
        this.book = book;
        this.rating = rating;
    }

    public Book() {

    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", book='" + book + '\'' +
                '}';
    }
}
