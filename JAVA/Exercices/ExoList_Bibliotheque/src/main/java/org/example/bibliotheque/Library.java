package org.example.bibliotheque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Library {

 private ArrayList<Book> books = new ArrayList<Book>();
 private ArrayList<Loan> loans = new ArrayList<Loan>();

    public Library(ArrayList<Book> books, ArrayList<Loan> loans) {
        this.books = books;
        this.loans = loans;
    }


    public void addBook(Book book){
        books.add(book);
    }

    public  void  deleteBook(Book book){
        books.remove(book.getId());
    }

    public ArrayList<Book> findBookByTitle (String title){
        ArrayList<Book> filteredBookByTitle = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getTitle() == title){
                filteredBookByTitle.add(book);
            }
        }
        return filteredBookByTitle;
    }
    public ArrayList<Book> findBookByAuthor (String author){
        ArrayList<Book> filteredBookByAuthor = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor() == author){
                filteredBookByAuthor.add(book);
            }
        }
        return filteredBookByAuthor;
    }

    private Book findBookById(int bookId) {
        Book findedBook = new Book();
        for (Book book : books) {
            if (book.getId() == bookId) {
             findedBook = book;
            }
        }
        return  findedBook;
    }
        
//        if ( bookId ){
//            Book book = books.get(bookId);
//            LocalDate loanDate = LocalDate.now();
//            loans.add(new Loan(loanDate ,book ,person));
//       }
//
//    };

    private boolean bookIsLoaned(int bookId){

        if()

        return false;
    };

    private Loan findLoanByBook(){


        return null;
    };

    private Date calculateDateEndLoaned(){


        return null;
    };
    public void loanBook (int bookId, Person person){

        Book book = findBookById(bookId);

        if(book == null){
            System.out.println("Livre non trouvé avec l'identifiant : " + bookId);
            return;
        }
        if (bookIsLoaned(book)){
            System.out.println("Le livre est déja emprunté");
        } else {
            LocalDate startDate = LocalDate.now();
            loans.add(new Loan(startDate,book,person));

            System.out.println("Emprunt enregistré");
        }

    }


    public void returnBook(String bookId){


    }




    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }
}
