package entity;

import exception.ConditionValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VoitureTest {

    private Voiture voiture;

    void setUp() {
        voiture = new Voiture();
    }


//    - Après l'expiration du contrat de location, la valeur de Condition se dégrade deux fois plus vite.

    @Test
    void WhenContractIsEndConditionShouldDecreaseFaster() throws Exception {
        Voiture voiture1 = new Voiture(0, 50);
//        voiture.setRentDueIn(0);
//        voiture.setCondition(50);
        voiture1.dailyRoutine();
        Assertions.assertEquals(48, voiture1.getCondition());

    }


//            - L'état d'une voiture n'est jamais négatif.

    @Test
    void ConditionOfACarCantBeNegative() {
        Voiture voiture1 = new Voiture(0, -1);
        Assertions.assertThrowsExactly(ConditionValueException.class, () -> voiture1.dailyRoutine());
    }


//            - L'état d'une voiture n'est jamais supérieur à 100.

    @Test
    void ConditionOfACarCantBeMoreThan100() {
        Voiture voiture1 = new Voiture(0, -1);
        Assertions.assertThrowsExactly(ConditionValueException.class, () -> voiture1.dailyRoutine());}


//            - L'état des voitures de luxe augmente avec le temps, car elles sont régulièrement entretenues.

    @Test
    void WhenCarIsOldConditionDoNotIncrease() throws Exception {
        Voiture voiture1 = new Voiture(50,50,true,false);
        voiture1.dailyRoutine();
        Assertions.assertEquals(51,voiture1.getCondition());
    }


//            - Les voitures plus anciennes se dégradent en condition deux fois plus vite que les voitures normales.


}