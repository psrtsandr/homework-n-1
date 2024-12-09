package org.example;

public class Main {
    public static void main(String[] args) {
        var crimeAndPunishment = new Book(
                new BookTitle("Преступление и наказание"),
                new BookAuthor("Достоевский Ф.М."),
                new PublishYear(1866),
                true);

        var caramazovBrothers = new Book(
                new BookTitle("Братья Карамазовы"),
                new BookAuthor("Достоевский Ф.М."),
                new PublishYear(1881),
                false);

        var demons = new Book(
                new BookTitle("Бесы"),
                new BookAuthor("Достоевский Ф.М."),
                new PublishYear(1871),
                true);

        var warAndPeace = new Book(
                new BookTitle("Война и мир"),
                new BookAuthor("Толстой Л.Н."));

        var annaKarenina = new Book(
                new BookTitle("Анна Каренина"),
                new BookAuthor("Толстой Л.Н."));

        var gunsOfAvalon = new Book(
                new BookTitle("The Guns of Avalon"),
                new BookAuthor("Roger Zelazny"));

        var ninePrincesInAmber = new Book(
                new BookTitle("Nine Princes in Amber"),
                new BookAuthor("Roger Zelazny"));

        var physics = new Book(
                new BookTitle("Физика"),
                new BookAuthor("Аристотель"),
                new PublishYear(2022),
                false);

        var categories = new Book(
                new BookTitle("Категории"),
                new BookAuthor("Аристотель"),
                new PublishYear(1999),
                false);

        var lib = new Library();

        // Добавить книги в библиотеку
        lib.addBook(crimeAndPunishment);
        lib.addBook(caramazovBrothers);
        lib.addBook(demons);
        lib.addBook(warAndPeace);
        lib.addBook(annaKarenina);
        lib.addBook(gunsOfAvalon);
        lib.addBook(ninePrincesInAmber);
        lib.addBook(physics);
        lib.addBook(categories);

        // Вывести на консоль доступные книги
        lib.printAvailableBooks();
        System.out.println();

        // Забрать книгу
        crimeAndPunishment.borrowBook();
        lib.printAvailableBooks();
        System.out.println();

        // Вернуть книгу
        warAndPeace.returnBook();
        lib.printAvailableBooks();
        System.out.println();

        // Вывести на консоль книги конкретного автора
        printBooksByAuthor(lib, new BookAuthor("Достоевский Ф.М."));
    }

    private static void printBooksByAuthor(Library lib, BookAuthor bookAuthor) {
        System.out.printf("Книги от автора %s:\n", bookAuthor);
        lib.findBooksByAuthor(bookAuthor).forEach(Book::displayInfo);
    }
}