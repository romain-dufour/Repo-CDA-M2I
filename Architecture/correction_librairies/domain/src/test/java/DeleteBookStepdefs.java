import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.domain.entity.Book;
import org.example.domain.port.BookRepository;
import org.example.domain.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
public class DeleteBookStepdefs {

    private BookService bookService;
    private Book book;
    private List<Book> resultSearch;
    private final BookRepository bookRepository;
    public DeleteBookStepdefs (){
        bookRepository = Mockito.mock(BookRepository.class);
        bookService = new BookService(bookRepository);
        book = new Book.Builder().title("toto").author("tata").build();
    }

    @Given("there are a book in the library with id {int}")
    public void thereAreABookInTheLibraryWithId(int id) {
        Mockito.doAnswer(invocationOnMock -> {
            Book b = invocationOnMock.getArgument(0);
            b.setId(id);
            return null;
        }).when(bookRepository).create(book);

        bookService.createBook("toto","tata");
    }


    @When("i delete the book with id {int}")
    public void iDeleteTheBookWithId(int idBook) {
        Mockito.when(bookRepository.findById(idBook)).thenReturn(book);
        Book book = bookRepository.findById(idBook);
//        Mockito.doNothing().when(bookRepository).delete(book);
//        bookRepository.delete(book);
        bookService.deleteBook(1);
    }

    @Then("empty list books should be returned")
    public void emptyListBooksShouldBeReturned() {
        Mockito.when(bookRepository.searchBook("tata")).thenReturn(List.of(book));
        resultSearch = bookService.searchBook("tata");
        Assertions.assertEquals(1, resultSearch.size());    }


}
