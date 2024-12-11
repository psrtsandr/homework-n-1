package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Библиотека
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAvailableBooks() {
        System.out.println("Доступные книги:");
        books
            .stream()
            .filter(Book::isAvailable)
            .forEach(Book::displayInfo);
    }

    public List<Book> findBooksByAuthor(BookAuthor author) {
        return books
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }
}
