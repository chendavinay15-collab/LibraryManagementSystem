package com.library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(1, "Java Programming", "James Gosling");
        Book book2 = new Book(2, "Python Basics", "Guido van Rossum");
        Book book3 = new Book(3, "Data Structures", "Mark Allen");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println("\n--- Issuing Book ---");
        library.issueBook(1);

        System.out.println("\n--- Books After Issue ---");
        library.displayBooks();

        System.out.println("\n--- Returning Book ---");
        library.returnBook(1);

        System.out.println("\n--- Books After Return ---");
        library.displayBooks();

        System.out.println("\nTotal Books: " + library.getBookCount());
    }
}