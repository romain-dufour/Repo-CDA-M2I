package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // Lire a partir d'un fichier texte
        try {
            Scanner scanner = new Scanner(new File("path/to/file"));
            StringBuilder textBuilder = new StringBuilder();
            do {
                textBuilder.append(scanner.nextLine());
            } while (scanner.hasNextLine());
            String allText = textBuilder.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
        

                //   String texte = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
                String
        texte = "La technologie moderne a radicalement transformé la façon dont nous interagissons avec le monde qui nous entoure. Des smartphones aux réseaux sociaux, en passant par l'intelligence artificielle, notre quotidien est profondément influencé par ces avancées. \n Les dispositifs intelligents connectés nous offrent une accessibilité sans précédent à l'information, transformant la manière dont nous communiquons, apprenons et travaillons. Cependant, cette omniprésence technologique suscite également des questions éthiques et sociales. Les préoccupations liées à la confidentialité des données, à la dépendance aux écrans et à l'impact sur l'emploi sont autant de défis que la société doit relever. L'équilibre entre progrès technologique et préservation des valeurs humaines devient ainsi une préoccupation majeure.\n Dans le domaine de la santé, la technologie a permis des avancées significatives, de la médecine personnalisée aux applications de suivi de la condition physique. Cependant, les discussions sur l'éthique de l'utilisation des données médicales et la sécurité des dispositifs médicaux connectés sont au cœur des débats. \n Malgré ces défis, l'innovation technologique reste un moteur de progrès. Des solutions émergent pour relever les défis actuels, allant de la régulation des technologies émergentes à la promotion de l'éducation numérique. En fin de compte, l'avenir de la technologie dépend de la manière dont nous intégrons ces avancées dans notre vie quotidienne tout en préservant notre humanité.";

        List<String> mots = Arrays.asList(texte.replaceAll(",", "").replaceAll("\\.", "").toLowerCase().split(" "));

        //fréquence des mots
        System.out.println(mots.stream().collect((Collectors.groupingBy(Function.identity(), Collectors.counting()))));
        System.out.println("**************");

        // filtrer les mots
        int lengh = 5;
        System.out.println(mots.stream().filter(m -> m.length() < lengh).collect(Collectors.toList()));
        System.out.println("**************");

        // Mots uniques
        System.out.println(mots.stream().distinct().collect(Collectors.toSet()));
        System.out.println("**************");
        Set<String> liste = new HashSet<>(mots);
        System.out.println("liste : " + liste);


        //Mots les plus fréquents
        System.out.println("**************");

        //  System.out.println(mots.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()).entrySet().stream));

        Map<String, Long> frequenceDesMots = mots.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequenceDesMots.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        System.out.println("**************");

        //longueurs moyenne, la plus courte, la plus longue

        System.out.println("Moyenne : " + mots.stream().mapToInt(String::length).average());

        System.out.println("**************");

        System.out.println("mot le plus court : " + mots.stream().min((mot1, mot2) -> Integer.compare(mot1.length(), mot2.length())).orElse(""));

        System.out.println("**************");

        System.out.println("mot le plus long : " + mots.stream().max((mot1, mot2) -> Integer.compare(mot1.length(), mot2.length())).orElse(""));

        System.out.println("**************");


    }

    public static void readFromFile() {

        try (Scanner scanner = new Scanner(new File("path/to/file"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}