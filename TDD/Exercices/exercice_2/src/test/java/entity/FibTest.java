package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibTest {

    private List<Integer> range(int r){
        Fib fib = new Fib(r);
        List<Integer> result = fib.getFibSeries();
        return result;
    }

    private Fib fib;

//    - Lors du déclanchement de la fonction getFibSeries() avec un Range de 1
//            - Le résultat n’est pas vide

    @Test
    void testFibSeriesIsNotEmpty(){
//        Fib fib = new Fib(1);
//        List<Integer> result = fib.getFibSeries();
        List<Integer> result = range(1);

        Assertions.assertFalse(result.isEmpty());

    }
//    - Le résultat correspond à une liste qui contient {0}

    @Test
    void testFibSeriesEqualList0(){
        List<Integer> result = range(1);

//        List<Integer> expected = new ArrayList<>();
//        expected.add(0);
        Assertions.assertEquals(Arrays.asList(0),result);
    }

//- Lors du déclanchement de la fonction getFibSeries() avec un Range de 6
//            - Le résultat contient le chiffre 3


    @Test
    void testFibWithRangeEquals6AndResultContain3(){
        List<Integer> result = range(6);

        Assertions.assertTrue(result.contains(3));
    }

    //            - Le résultat contient 6 éléments
    @Test
    void testFibWithRangeEquals6AndResultContain6Elements(){
        List<Integer> result = range(6);
        int ListSize = result.size();

        Assertions.assertEquals(6,ListSize);
    }

//    - Le résultat n’a pas le chiffre 4 en son sein

    @Test
    void testFibWithRangeEquals6AndResultDoNotContains4(){
        List<Integer> result = range(6);

        Assertions.assertFalse(result.contains(4));
    }

    //    - Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}
    @Test
    void testFibWithRangeEquals6AndResultIsListOf011235(){

        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertTrue(res.containsAll(Arrays.asList(1,1,2,3,5,0)));
    }


//    - Le résultat est trié de façon ascendance

    @Test
    void testFibWithRangeEquals6AndResultIsSortAscending(){
        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertEquals(Arrays.asList(0,1,1,2,3,5), res);
    }

}
