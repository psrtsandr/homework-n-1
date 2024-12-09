package org.example;

public record PublishYear(int value) {
    public PublishYear {
        if (value < 0 || value > 9999) {
            throw new IllegalArgumentException("Год публикации должен быть в пределах [0, 9999].");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
