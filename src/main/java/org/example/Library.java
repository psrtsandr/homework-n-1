package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Библиотека
 */
public class Library {
    private ArrayList<Book> _books = new ArrayList<>();

    public void addBook(Book book) {
        _books.add(book);
    }

    public void printAvailableBooks() {
        System.out.println("Доступные книги:");
        _books
            .stream()
            .filter(Book::isAvailable)
            .forEach(Book::displayInfo);
    }

    public List<Book> findBooksByAuthor(BookAuthor author) {
        return _books
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }
}
