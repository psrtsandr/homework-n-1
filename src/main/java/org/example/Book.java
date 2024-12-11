package org.example;

/**
 * Книга
 */
public class Book {
    private BookTitle title;
    private BookAuthor author;
    private PublishYear publishYear;
    private boolean isAvailable;

    public Book(BookTitle title, BookAuthor author) {
        this.title = title;
        this.author = author;
    }

    public Book(BookTitle title, BookAuthor author, PublishYear publishYear, boolean isAvailable) {
        this(title, author);
        this.publishYear = publishYear;
        this.isAvailable = isAvailable;
    }

    public BookTitle getTitle() {
        return title;
    }

    public BookAuthor getAuthor() {
        return author;
    }

    public PublishYear getPublishYear() {
        return publishYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
        else {
            System.out.println("Книга недоступна для выдачи");
        }
    }

    public void returnBook() {
        isAvailable = true;
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
