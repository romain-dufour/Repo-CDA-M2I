package org.example.ManagementBook;

import static java.lang.Double.valueOf;

public class Demo {
    public static void main(String[] args) {

Book[]books = new Book[]{
        new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1,
                "Publisher_1"), 1990, 231, valueOf(24.99), Book.CoverType.BROCHE);

        new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2,
                "William", "Wilson") }, new Publisher(2, "Publisher_2 "), 2000, 120,
                double.valueOf(14.99), Book.CoverType.BROCHE);

        new Book(3, "Livre_3", new Author[] { new Author(3, "Walter", "Peterson") },
                new Publisher(1, "Publisher_1"), 1997, 350, double.valueOf(34.99),
                Book.CoverType.RELIE);

        new Book( (4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") },
                new Publisher(3, "Publisher_3"), 1992, 185, double.valueOf(19.99), Book.CoverType.BROCHE) } ;

    }
}
