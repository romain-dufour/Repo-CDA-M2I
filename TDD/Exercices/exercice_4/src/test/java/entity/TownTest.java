package entity;

import org.example.entity.Town;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TownTest {

    Town town = new Town();
    List<String> townList = new ArrayList<>(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
            "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï",
            "Rome", "Istanbul"));

//    Si le texte de la recherche contient moins de 2 caractères, aucun résultat ne devrait être renvoyé ou Une exception est levée de type NotFoundException.

    //    @Test
//    void textLessThan2ChartShouldHaveNoResult(){
//        String textResearch = "te";
//        List<String> resultList = town.search(textResearch);
//        Assertions.assertEquals(resultList.size(),0);
//    }
    @Test
    void textLessThan2ChartShouldHaveNotFoundException(){
        String textResearch = "V";
        List<String> resultList = town.search(textResearch);
        Assertions.assertThrowsExactly(Exception.class, () -> {
        town.search(textResearch);});
    }

//    Si le texte de recherche est égal ou supérieur à 2 caractères, il doit renvoyer tous les noms de ville commençant par le texte de recherche exact.
//    Par exemple, pour le texte de recherche "Va", la fonction doit renvoyer Valence et Vancouver

    @Test
    void textSupOrEqual2ChartsShouldGiveAllTownBeginningByCharts(){
        String textResearch = "Va";
        List<String> resultList = town.search(textResearch);

        Assertions.assertTrue(resultList.contains(""));
    }

//    La fonctionnalité de recherche doit être insensible à la casse

    @Test
    void MethodShouldNotBeSensitiveToTheCase(){
        String textResearch = "VALENCE";
        List<String> resultList = town.search(textResearch);
        Assertions.assertEquals(resultList.contains(textResearch),"Valence");

    }

//    La fonctionnalité de recherche devrait également fonctionner lorsque le texte de recherche
//    n'est qu'une partie d'un nom de ville Par exemple "ape" devrait renvoyer la ville "Budapest"
    @Test
    void MethodShouldWorksWhenSearchIsPartOfTheTown(){
        String textResearch = "ape";
        List<String> resultList = town.search(textResearch);
        Assertions.assertTrue(resultList.contains("Budapest"));

    }

//    Si le texte de recherche est un « * » (astérisque), il doit renvoyer tous les noms de ville.
    @Test
    void IfTextIsAsterisqueMethodShouldReturnAllTheTown(){

    }

}
