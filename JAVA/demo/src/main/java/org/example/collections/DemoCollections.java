package org.example.collections;

import java.util.*;

public class DemoCollections {
    public static void main(String[] args) {

        //Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector : " + vector);

        //Methodes pour le vector
        System.out.println("1. Taille du vector : " +vector.size());
        System.out.println("2. Element a l'index 1 : " +vector.get(1));
        System.out.println("3. Est ce que Apple est présent :  " +vector.contains("Apple"));


        // Démo SortedSet (Treeset)

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        // sortedSet.add("Java"); ne passera pas dans la liste car doublon
        sortedSet.add("C++");

        System.out.println("SortedSet : " +sortedSet);

        // Methodes pour sortedset
        System.out.println("1. Premier element : " + sortedSet.first());
        System.out.println("2. Dernier element : " +sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Python");
        System.out.println("3. Sous-ensemble avant 'Python' : " + headSet);


        // Demo pour LinkedList
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.71);
        linkedList.add(1.85);
        System.out.println("Mi,kedList : " + linkedList);

        // Méthodes pour le linkedList

        System.out.println("1. Premier element : " + linkedList.getFirst());
        System.out.println("2. Dernier element : " + linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("3. Suppression premier element : " + linkedList);

        // SortedMap (TreeMap)
        SortedMap<String,Integer>sortedMap = new TreeMap<>();
        sortedMap.put("Java", 20);
        sortedMap.put("Python", 20);
        sortedMap.put("C++", 20);
        System.out.println("SortedMap : " + sortedMap);

        // Methode pour sotedMap

        System.out.println("1. Clés de sortedMap : "+ sortedMap.keySet());
        System.out.println("2. Valeurs de sortedMap : "+ sortedMap.values());
        System.out.println("3. Supprimer l'entrée avec la clé  'Java' ");
        sortedMap.remove("Java");
        System.out.println("SortedMap apres suppression : " + sortedMap);

        for (String k :
                sortedMap.keySet()) {
            System.out.println("Clé " + k + " valeur : " + sortedMap.get(k));
        }

        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 20);
        hashMap.put("Python", 10);
        hashMap.put("C++", 30);
        System.out.println("hashMap : " + hashMap);


        //Methode pour hashmap
        System.out.println("1. Taille de hashMap : "+ hashMap.size());
        System.out.println("2. Valeurs associé a la clé 'Java' : "+ hashMap.get("Java"));
        System.out.println("3. la clé  'javascript' est elle présente :  " + hashMap.containsKey("javascript"));
        System.out.println("Suppression de l'entree avec la cle 'Python'");
        hashMap.remove("Python");
        System.out.println("hashMap : " + hashMap);




    }

}

