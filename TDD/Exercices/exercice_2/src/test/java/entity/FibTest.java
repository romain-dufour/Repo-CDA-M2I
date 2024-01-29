package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FibTest {

//    - Lors du déclanchement de la fonction getFibSeries() avec un Range de 1
//            - Le résultat n’est pas vide
//    - Le résultat correspond à une liste qui contient {0}

    @Test
    void testFibSeriesIsNotEmpty(){
        int range = 1;
        Fib fib = new Fib(range);
        List<Integer> result = fib.getFibSeries();

        Assertions.assertFalse(result.isEmpty());

    }

    @Test
    void testFibSeriesEqualList0(){
        int range = 1;
        Fib fib = new Fib(range);
        List<Integer> result = fib.getFibSeries();

        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        Assertions.assertEquals(expected,result);
    }

//- Lors du déclanchement de la fonction getFibSeries() avec un Range de 6
//            - Le résultat contient le chiffre 3


    @Test
    void testFibWithRangeEquals6AndResultContain3(){
        int range = 6;
        Fib fib = new Fib(range);
        List<Integer> result = fib.getFibSeries();

        Assertions.assertTrue(result.contains(3));
    }

    //            - Le résultat contient 6 éléments
    @Test
    void testFibWithRangeEquals6AndResultContain6Elements(){
        int range = 6;
        Fib fib = new Fib(range);
        List<Integer> result = fib.getFibSeries();
        int ListSize = result.size();

        Assertions.assertEquals(ListSize,6);
    }

//    - Le résultat n’a pas le chiffre 4 en son sein

    @Test
    void testFibWithRangeEquals6AndResultDoNotContains4(){
        int range = 6;
        Fib fib = new Fib(range);
        List<Integer> result = fib.getFibSeries();

        Assertions.assertFalse(result.contains(4));
    }

//    - Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}
@Test
void testFibWithRangeEquals6AndResultIsListOf011235(){
    int range = 6;
    Fib fib = new Fib(range);
    List<Integer> result = fib.getFibSeries();

    List<Integer> expected = new ArrayList<>();
    expected.add(0);
    expected.add(1);
    expected.add(1);
    expected.add(2);
    expected.add(3);
    expected.add(5);

    Assertions.assertEquals(expected,result);
}


//    - Le résultat est trié de façon ascendance

    @Test
    void testFibWithRangeEquals6AndResultIsSortAscending(){
        int range = 6;
        Fib fib = new Fib(range);
        List<Integer> result = fib.getFibSeries();


        Assertions.assertTrue(isSortedAscending(result));
    }

    private boolean isSortedAscending(List<Integer> list){
        for (int i = 0 ; i < list.size() -1 ; i++){
            if(list.get(i)> list.get(i + 1)){
                return false;
            }
        }
        return true;
    }



}
