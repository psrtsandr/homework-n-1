package org.example;

public record BookAuthor(String value) {
    public BookAuthor {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("ФИО автора не может быть пустым.");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
