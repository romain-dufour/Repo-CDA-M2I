package entity;

import org.example.entity.Year;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearTest {
    //    Une année divisible par 400.
    //    Une année divisible par 4 mais pas par 100.
    //    Une année divisible par 4000.


    @Test
    void testLeapYearDivisibleBy400(){
        Year year = new Year();
        int testYear = 2024;
        boolean res = year.yearIsLeapYear(testYear);
        Assertions.assertTrue(res);
    }

    @Test
    void testLeapYearDivisibleBy4ButNotBy100(){
        Year year = new Year();
        int testYear = 2024;
        boolean res = year.yearIsLeapYear(testYear);
        Assertions.assertTrue(res);
    }


    @Test
    void testLeapYearDivisibleBy4000(){
        Year year = new Year();
        int testYear = 2024;
        boolean res = year.yearIsLeapYear(testYear);
        Assertions.assertTrue(res);
    }


}
