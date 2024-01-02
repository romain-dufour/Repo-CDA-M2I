package demo;

import entity.Person;

import javax.persistence.*;
import java.util.List;

public class Demo2 {

    public static void main() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();

        transac.begin();
/*
        try {
            Person person = em.getReference(Person.class, 1L);
            System.out.println(person);
        }catch (EntityNotFoundException ex){
            System.out.println("Entity non trouvée");
        };



        // Récupération par Query
        System.out.println("récupération par query");

        // singleResult
        Query query = em.createQuery("select p from Person p where p.nom = 'Nulengeo'", Person.class);

        Person person = (Person) query.getSingleResult();
        System.out.println(person);


        // resultList

        Query query1 = em.createQuery("select p from Person p where p.id > 3");
        List<Person> personList = query1.getResultList();

        for (Person p : personList) {
            System.out.println("person : " + p.getNom());
        }


        // Parametres nommés
        Query query2 = em.createQuery("select p from Person p where p.id > :id");
        query2.setParameter("id",3L);
        List<Person> personList2 = query2.getResultList();

        for (Person p : personList2) {
            System.out.println("person trouvée avec parametre nommé : " + p.getNom());
        }


        System.out.println("Modifier une occurence :");

        Person person4 = em.find(Person.class,4L);
        person4.setNom("Pesquet");
        person4.setPrenom("jim");


        transac.commit();
        person4 = em.find(Person.class,4L);
        System.out.println("Person : " + person4);*/

        System.out.println("Rollback :");

        Person person6 = new Person("Jim", "Paul");
        em.persist(person6);
        if (person6.getId() == 16L){
            System.out.println("person " + person6.getId());
            transac.rollback();
        }else {
            em.getTransaction().commit();
            System.out.println("person " + person6.getId());
        }


        System.out.println("NativeQuery : ");
        List<Person> personList = em.createNativeQuery("SELECT * FROM person",Person.class).getResultList();
        for(Person p : personList) {
            System.out.println("p : " + p);
        }



        em.close();
        emf.close();

    }

}
