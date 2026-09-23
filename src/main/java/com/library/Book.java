package com.library;

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issueBook() {
        if (available) {
            available = false;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " is already available.");
        }
    }

    public void displayBook() {
        System.out.println(
            "ID: " + id +
            ", Title: " + title +
            ", Author: " + author +
            ", Available: " + available
        );
    }
}