package com.example.adapteur.ressource;


import com.example.adapteur.dto.BookDto;
import jakarta.ws.rs.*;
import org.example.dto.BookDto;
import org.example.entity.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookRepositoryImpl;
import org.example.service.BookService;

@Path("books")
@Consumes
@Produces
public class BookRessource {

    private BookService bookService;

    public BookRessource() {
        bookService = new BookService(new BookRepositoryImpl());
    }


    @POST
    public BookDto post(Book book){return bookService.createBook(book.);}

    @GET
    @Path("{id}")
    public BookDto get(@PathParam("id") Long id) {return bookService.searchBook(id);}

    @DELETE
    @Path("{id}")
    public boolean delete(@PathParam("id") Long id) {
        BookEntity bookEntity = bookService.searchBook(id);
        if(bookEntityRepository.delete(bookEntity)){
            return true;
        } else {return false;}

    }
}
