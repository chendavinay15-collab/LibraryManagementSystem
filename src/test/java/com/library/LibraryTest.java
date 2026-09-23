package com.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {

        Library library = new Library();

        Book book = new Book(
                1,
                "Java Programming",
                "James Gosling"
        );

        library.addBook(book);

        assertEquals(1, library.getBookCount());
    }

    @Test
    public void testFindBook() {

        Library library = new Library();

        Book book = new Book(
                1,
                "Java Programming",
                "James Gosling"
        );

        library.addBook(book);

        Book foundBook = library.findBook(1);

        assertNotNull(foundBook);
        assertEquals("Java Programming", foundBook.getTitle());
    }

    @Test
    public void testBookIssueAndReturn() {

        Library library = new Library();

        Book book = new Book(
                1,
                "Java Programming",
                "James Gosling"
        );

        library.addBook(book);

        library.issueBook(1);

        assertFalse(book.isAvailable());

        library.returnBook(1);

        assertTrue(book.isAvailable());
    }
}