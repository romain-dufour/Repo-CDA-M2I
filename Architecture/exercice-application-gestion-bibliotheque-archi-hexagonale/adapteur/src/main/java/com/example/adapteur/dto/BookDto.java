package com.example.adapteur.dto;

/**
 * DTO for {@link org.example.entity.Book}
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.Book;
import org.example.entity.BookEntity;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    Long id;
    String title;
    String author;
    boolean isAvailable;

    public Book toEntity(){
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        book.setAvailable(isAvailable);

        return book;
    }
}
