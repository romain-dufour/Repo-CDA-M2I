import com.example.tp_devinette.entity.Ridlle;
import com.example.tp_devinette.exception.RiddleException;
import com.example.tp_devinette.repository.Repository;
import com.example.tp_devinette.riddleGenerator.RiddleGenerator;
import com.example.tp_devinette.service.RiddleService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RidlleServiceTest {

    SessionFactory sessionFactory;
    Repository<Ridlle> ridlleRepository;



    private RiddleService riddleService = new RiddleService(sessionFactory,ridlleRepository);

    private Ridlle ridlle;

    @BeforeEach
    void setUpRiddle(){ridlle = new Ridlle();}




}
