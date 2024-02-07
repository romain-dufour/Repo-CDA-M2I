import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entity.Book;
import org.example.service.BookService;
import org.example.spi.port.BookRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookFeatureTest {

    private BookService bookService;
    private Book book;

    private List<Book> bookList;
    @Mock
    private BookRepository bookRepository;
    private BookFeatureTest(){
        bookService = new BookService(bookRepository);
        book = new Book.Builder().title("toto").author("tata").isAvailable(true).build();
    }
    @Given("there are some books in the library")
    public void there_are_some_books_in_the_library() {
        Mockito.doAnswer(invocationOnMock -> {
            Book b = invocationOnMock.getArgument(0);
            b.setId(1L);
            return null;
        }).when(bookRepository.create(book));

        bookService.createBook("toto", "tata", true);

    }

    @When("I search for books with title started with {string}")
    public void i_ask_for_all_books(String search ) {
        Mockito.when(bookRepository.)
        bookService.searchBook(search);
    }

    @Then("all books should be returned")
    public void all_books_should_be_returned() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
