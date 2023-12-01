package org.example.bibliotheque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {

 private List<Book> books ;
 private List<Loan> loans; ;

    public Library(ArrayList<Book> books, ArrayList<Loan> loans) {
        this.books = new ArrayList<Book>();
        this.loans =  new ArrayList<Loan>();
    }


    public void addBook(Book book){
        books.add(book);
    }

    public  boolean  deleteBook(int bookId){
        Book book = findBookById(bookId);
        if(book != null){
            return books.remove(book);

        };

//        for (Book book: books
//             ) {
//            if (book.getId() == bookId){
//                books.remove(bookId);
//            }
//        }
//        books.remove(bookId);
        return false;
    };

    public ArrayList<Book> findBookByTitle (String title){
        ArrayList<Book> filteredBookByTitle = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().equals(title)){
                filteredBookByTitle.add(book);
            }
        }
        return filteredBookByTitle;
    }
    public ArrayList<Book> findBookByAuthor (String author){
        ArrayList<Book> filteredBookByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)){
                filteredBookByAuthor.add(book);
            }
        }
        return filteredBookByAuthor;
    }

    private Book findBookById(int bookId) {
        //si id n'existe pas retourner un null qui sert de false dans ce cas
        Book findedBook = null;
        for (Book book : books) {
            if (book.getId() == bookId) {
             findedBook = book;
             break;
             //rajouter un break pour arreter la boucle vu que l'id est unique
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
    public boolean loanBook (int bookId, Person person){

        Book book = findBookById(bookId);

        if(book == null){
//            System.out.println("Livre non trouvé avec l'identifiant : " + bookId);
            return false;
        }
        if (bookIsLoaned(bookId)){
            return false;
//            System.out.println("Le livre est déja emprunté");
        } else {
            LocalDate startDate = LocalDate.now();
            loans.add(new Loan(startDate,book,person));

            return true;
//            System.out.println("Emprunt enregistré");

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
