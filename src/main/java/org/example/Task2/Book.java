package org.example.Task2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private LocalDate published;

    public Book(String title, String author, LocalDate published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book title: " + title + ", author: " + author + ", published on: " + published;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public LocalDate getPublished() {
        return published;
    }

}
