package entity;

import org.example.entity.Hangman;
import org.example.entity.WordGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HangmanTest {

    @Mock
    private WordGenerator wordGenerator;
    private Hangman hangman;

    @BeforeEach
    void setUp() {
        Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman = new Hangman(wordGenerator);
        hangman.makeMask();
    }

    @Test
    void testConvertWordToMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        //hangman.makeMask();
        Assertions.assertEquals("______", hangman.getMask());
    }
    @Test
    void testTryCharWithCorrectChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = hangman.tryChar('g');
        Assertions.assertTrue(result);
    }
    @Test
    void testTryCharWithWrongChar() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        boolean result = hangman.tryChar('t');
        Assertions.assertFalse(result);
    }

    @Test
    void testTryCharWithCorrectCharShouldNotUpdateTryValue() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        int tryNumber = hangman.getTryNumber();
       hangman.tryChar('g');
        Assertions.assertEquals(tryNumber, hangman.getTryNumber());
    }

    @Test
    void testTryCharWithWrongCharShouldNotDecreaseTryValue() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        int tryNumber = hangman.getTryNumber();
        hangman.tryChar('a');
        Assertions.assertEquals(tryNumber-1, hangman.getTryNumber());
    }

    @Test
    void testTryCharWithCorrectCharShouldUpdateMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman.tryChar('g');
        Assertions.assertEquals("g__g__", hangman.getMask());
    }

    @Test
    void testTryCharWithWrongCharShouldNotUpdateMask() {
        //Mockito.when(wordGenerator.getRandomWord()).thenReturn("google");
        hangman.tryChar('g');
        hangman.tryChar('a');
        Assertions.assertEquals("g__g__", hangman.getMask());
    }


    @Test
    void testGameIsWinWhenWordIsFindAndTryNumberIsOverThan0(){
        hangman.tryChar('g');
        hangman.tryChar('a');
        hangman.tryChar('l');
        hangman.tryChar('a');
        hangman.tryChar('g');
        hangman.tryChar('o');
        hangman.tryChar('g');
        hangman.tryChar('e');
        Assertions.assertEquals("google", hangman.getMask());
    }

    @Test
    void testReturnWinWhenTheWordIsFindAndNumberOfTestIsGT0(){
        hangman.tryChar('g');
        hangman.tryChar('a');
        hangman.tryChar('l');
        hangman.tryChar('a');
        hangman.tryChar('g');
        hangman.tryChar('o');
        hangman.tryChar('g');
        hangman.tryChar('e');
        Assertions.assertTrue(hangman.isGameIsWin());
    }

    @Test
    void testGameIsLostWhenTryNumberIsOverPast(){
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        hangman.tryChar('a');
        Assertions.assertTrue(hangman.isGameIsLost());
    }




    @Test
    void testMessageIsSendWhenGameIsWin(){
    }


    @Test
    void testMessageIsSendWhenGameIsLost(){
    }
}
