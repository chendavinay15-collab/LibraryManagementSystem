package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added successfully.");
    }

    public void displayBooks() {
        System.out.println("\n--- Library Books ---");

        for (Book book : books) {
            book.displayBook();
        }
    }

    public Book findBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }

        return null;
    }

    public void issueBook(int id) {
        Book book = findBook(id);

        if (book != null) {
            book.issueBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(int id) {
        Book book = findBook(id);

        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public int getBookCount() {
        return books.size();
    }
}