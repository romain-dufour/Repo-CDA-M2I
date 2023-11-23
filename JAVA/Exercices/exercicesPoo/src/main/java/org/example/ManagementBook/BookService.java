package org.example.ManagementBook;

public class BookService {

    public Book[] filterBooksByAuthor(Author author, Book[] books) {

        int index = 0;

        for (Book book : books) {
            for(Author auteur1:  book.getAuthors()){

                if (auteur1.getId() == author.getId()){
                    index++;
                }
            }
            Book[] filterBooks = new Book[index];
            int index2 = 0;
            for (Author auteur1:  book.getAuthors()) {
                if (auteur1.getId() == author.getId()){
                    filterBooks[index2]=
                    ;
                }

            }
            
        }
        return null;
    };

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {


        return null;

    };

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {



        return null;

    };

}
