package org.example.ManagementBook;

public class BookService {

    public Book[] filterBooksByAuthor(Author author, Book[] books) {

        int index = 0;

        Book[] filteredBooks = new Book[0];
        for (Book book : books) {
            for (Author auteur1 : book.getAuthors()) {

                if (auteur1.getId() == author.getId()) {
                    index++;
                }
            }
            filteredBooks = new Book[index];
            int index2 = 0;
            for (Author auteur1 : book.getAuthors()) {
                if (auteur1.getId() == author.getId()) {
                    filteredBooks[index2++] = book;
                }
            }
        }
        return filteredBooks;
    };

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        int index = 0;

        Book[] filteredBooks = new Book[0];
        for (Book book : books) {
            for (Publisher publisher1: book.getPublisher()) {

                if (publisher1.getId() == publisher.getId()) {
                    index++;
                }
            }
            filteredBooks = new Book[index];
            int index2 = 0;
            for (Author publisher1 : book.getPublisher()) {
                if (publisher1.getId() == publisher.getId()) {
                    filteredBooks[index2++] = book;
                }
            }
        }
        return filteredBooks;


    };

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {



        return null;

    };

}
