package org.example;

/**
 * Книга
 */
public class Book {
    private BookTitle _title;
    private BookAuthor _author;
    private PublishYear _publishYear;
    private boolean _isAvailable;

    public Book(BookTitle title, BookAuthor author) {
        _title = title;
        _author = author;
    }

    public Book(BookTitle title, BookAuthor author, PublishYear publishYear, boolean isAvailable) {
        this(title, author);
        _publishYear = publishYear;
        _isAvailable = isAvailable;
    }

    public BookTitle getTitle() {
        return _title;
    }

    public BookAuthor getAuthor() {
        return _author;
    }

    public PublishYear getPublishYear() {
        return _publishYear;
    }

    public boolean isAvailable() {
        return _isAvailable;
    }

    public void borrowBook() {
        if (_isAvailable) {
            _isAvailable = false;
        }
        else {
            System.out.println("Книга недоступна для выдачи");
        }
    }

    public void returnBook() {
        _isAvailable = true;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Книга (Название: %s, Автор: %s, Год издания: %s, Доступна для выдачи: %s)",
                getTitle(),
                getAuthor(),
                getPublishYear() == null ? "не указан" : getPublishYear(),
                isAvailable() ? "да" : "нет");
    }
}
