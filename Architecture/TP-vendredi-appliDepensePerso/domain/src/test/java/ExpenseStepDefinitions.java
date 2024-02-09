import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entity.Depense;
import org.example.port.DepenseRepository;
import org.example.service.DepenseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ExpenseStepDefinitions {

    private DepenseService depenseService;
    private Depense firstDepense;
    private Depense secondDepense;
    private List<Depense> depenses;

    private final DepenseRepository depenseRepository;

    public ExpenseStepDefinitions() {
        depenseRepository = Mockito.mock(DepenseRepository.class);
        depenseService = new DepenseService(depenseRepository);
    }


    @Given("there no spend in the list of spend")
    public void thereNoSpendInTheListOfSpend() {

    }

    @When("I create a spend")
    public void iCreateASpend() {
        firstDepense = new Depense.Builder().titre("pizza").montant(2000).id(1).build();
        Mockito.doAnswer(invocationOnMock -> {
            Depense d = invocationOnMock.getArgument(0);
            d.setId(1);
            return null;
        }).when(depenseRepository).create(firstDepense);

        depenseService.createDepense(2000, "pizza");
    }


    @Then("List with {int} spend should be returned")
    public void listWithSpendShouldBeReturned(int size) {
        Mockito.when(depenseRepository.listDepense()).thenReturn(List.of(firstDepense));
        depenses = depenseService.depenses();
        Assertions.assertEquals(size,depenses.size());
    }



    @Given("there two spends in the list of spends, one with id {int}")
    public void thereTwoSpendsInTheListOfSpendsOneWithId(int id) {
        firstDepense = new Depense.Builder().montant(100).titre("firstExpense").id(id).build();
        Mockito.doAnswer(invocationOnMock -> {
            Depense d =invocationOnMock.getArgument(0);
            d.setId(id);
            return null;
        }).when(depenseRepository).create(firstDepense);
        depenseService.createDepense(100,"firstExpense");
    }

    @And("second with id {int}")
    public void secondWithId(int id) {
        secondDepense = new Depense.Builder().montant(200).titre("secondExpense").id(id).build();
        Mockito.doAnswer(invocationOnMock -> {
            Depense d =invocationOnMock.getArgument(0);
            d.setId(id);
            return null;
        }).when(depenseRepository).create(secondDepense);
        depenseService.createDepense(200,"secondExpense");
    }

    @When("I get the list of spends")
    public void iGetTheListOfSpends() {

        Mockito.when(depenseRepository.listDepense()).thenReturn(depenses);
        depenses = depenseService.depenses();
    }

    @Then("List with {int} spends should be returned")
    public void listWithSpendsShouldBeReturned(int size) {
        Assertions.assertEquals(size,depenses.size());

    }


}
