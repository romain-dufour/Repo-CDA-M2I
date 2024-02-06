package org.example.service;

import org.example.entity.Book;
import org.example.spi.port.BookRepository;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(String title, String author, boolean isAvailable){
        Book book = new Book(title,author,isAvailable);
        if(bookRepository.create(book)){
            return book;
        }
        throw new RuntimeException();
    }


    public Book searchBook (Long id) {
        Book book = bookRepository.findById(id);
        return book;
    }

    public boolean deleteBook (Long id) {
        Book book = bookRepository.findById(id);
        if(bookRepository.delete(book)){
            return true;
        }
        return false;
    }


}
