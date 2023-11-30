package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import org.example.models.Maison;
import org.example.models.Person;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        String asciiArt = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiArt);

        Person person = new Person(2);
        Person person1 = new Person(2);

        person.setId(1);
        person.setFirstName("toto");
        person.setLastName("titi");

        person1.setFirstName("toto");
        person1.setLastName("titi");

        System.out.println(person.getId());
        System.out.println(person);
        System.out.println(person1);

        System.out.println(person1.equals(person));


        Maison maison = new Maison(4);





    }
}