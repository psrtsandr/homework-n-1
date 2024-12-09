package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> _books = new ArrayList<>();

    public void addBook(Book book) {
        _books.add(book);
    }

    public void printAvailableBooks() {
        System.out.println("Доступные книги:");
        _books.forEach(Book::displayInfo);
    }

    public List<Book> findBooksByAuthor(String author) {
        return _books
                .stream()
                .filter(book -> book.getAuthor().value().equals(author))
                .toList();
    }

    public List<Book> findBooksByAuthor(BookAuthor author) {
        return findBooksByAuthor(author.value());
    }
}
