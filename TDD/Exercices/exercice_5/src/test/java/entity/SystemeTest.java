package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SystemeTest {

    Systeme systeme = new Systeme;
    @Test
    void whenDateIsEqualTo0QualityDegradeTwice(){
        int sellIn1 = 0;
        int sellIn2 = 1;
        int quality = 50;
        int result1 = systeme.update(sellIn1,quality).getQuality;
        int result2 = systeme.update(sellIn2, quality).getQuality;


        Assertions.assertTrue();

    }




}
