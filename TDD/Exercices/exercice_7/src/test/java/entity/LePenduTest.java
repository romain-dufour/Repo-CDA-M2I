package entity;

import org.example.entity.LePendu;
import org.example.entity.RandomMask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class LePenduTest {
    
    private LePendu lePendu;
    
    @Mock
    private RandomMask randomMask;


//    Une méthode pour générer un masque, cette méthode fait appelle à un objet qui permet de générer d'une façon aléatoire un mot à trouver à partir d'un tableau de mots.


    
//    Une méthode pour tester si un char est dans le mot.
    
    @Test
    void isTheChoosenCharInTheRandomWord(){
        lePendu = new LePendu(randomMask);
        Mockito.when(randomMask.getRandomString()).thenReturn("toto");

        Assertions.assertTrue(lePendu.isACharInTheWord('o'));
    }

    @Test
    void isTheChoosenCharNotInTheRandomWord(){
        lePendu = new LePendu(randomMask);
        Mockito.when(randomMask.getRandomString()).thenReturn("toto");

        Assertions.assertFalse(lePendu.isACharInTheWord('a'));
    }
    
//    Une méthode pour tester si le joueur a gagné.

    @Test
    void isThePlayerWin(){
        lePendu = new LePendu(randomMask);
        Mockito.when(randomMask.getRandomString()).thenReturn("toto");
        Assertions.assertTrue(lePendu.isThePlayerWin("toto"));
    }
}
