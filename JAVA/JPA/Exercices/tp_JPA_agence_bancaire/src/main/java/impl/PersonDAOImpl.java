package impl;

import dao.PersonDAO;
import models.Account;
import models.Agency;
import models.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    private EntityManagerFactory entityManagerFactory;
    public PersonDAOImpl(EntityManagerFactory entityManagerFactory){
        this.entityManagerFactory = entityManagerFactory;
    }
    @Override
    public boolean addPerson(Person person) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(person);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean deletePerson(Long personId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Person person = entityManager.find(Person.class,personId);
            if(person != null){
                entityManager.remove(person);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }


    public Person getPersonById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<Person> personList = entityManager.createQuery("SELECT p FROM Person p", Person.class).getResultList();

        for (Person person : personList
        ) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
}
