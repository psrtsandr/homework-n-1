package org.example;

public record BookTitle(String value) {
    public BookTitle {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Название книги не может быть пустым.");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
