package impl;

import dao.CategorieDAO;
import model.Categorie;
import model.Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Collections;
import java.util.List;

public class CategorieDAOimpl implements CategorieDAO {

    private EntityManagerFactory emf;

    public CategorieDAOimpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public boolean addCategorie(Categorie categorie) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(categorie);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            em.close();
        }
    }

    @Override
    public List<Categorie> getAllCategorie() {
        return null;
    }

    @Override
    public boolean deleteCategorie(Long categorieId) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Categorie categorie = entityManager.find(Categorie.class,categorieId);
            if(categorie != null){
                entityManager.remove(categorie);
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
/*
    @Override
    public List<Task> gettasksByCategorie(Long categorieId) {
        EntityManager entityManager = emf.createEntityManager();
        List<Task> tasks = entityManager.createQuery("SELECT t FROM Task t WHERE t.categorie.getid = :categorieId", Task.class)
                .setParameter("categorieId", categorieId)
                .getResultList();
        entityManager.close();
        return tasks;    }

*/
    @Override
    public List<Task> gettasksByCategorie(Long categorieId) {
        EntityManager entityManager = emf.createEntityManager();
        Categorie categorie = entityManager.find(Categorie.class, categorieId);

        if (categorie != null) {
            List<Task> tasks = categorie.getTaskList();
            entityManager.close();
            return tasks;
        } else {
            entityManager.close();
            return Collections.emptyList();
        }
    }
/*
    @Override
    public List<Task> addTaskToCategorie(Long taskId, Long categorieId) {
        EntityManager entityManager = emf.createEntityManager();
        Categorie categorie = entityManager.find(Categorie.class, categorieId);
        Task task = entityManager.find(Task.class, taskId);

        if (categorie != null && task!= null) {
            List<Task> tasks = categorie.getTaskList();
            entityManager.close();
            return tasks;
        } else {
            entityManager.close();
            return Collections.emptyList();
        }    }
*/
    @Override
    public List<Task> addTaskToCategorie(Long taskId, Long categorieId) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            Categorie categorie = entityManager.find(Categorie.class, categorieId);
            Task task = entityManager.find(Task.class, taskId);

            if (categorie != null && task != null) {
                git
                categorie.getTaskList().add(task);
                entityManager.merge(categorie);
                transaction.commit();

                List<Task> tasks = categorie.getTaskList();
                entityManager.close();
                return tasks;
            } else {
                transaction.rollback();
                entityManager.close();
                return Collections.emptyList();
            }
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            entityManager.close();
            return Collections.emptyList();
        }
    }

    @Override
    public List<Task> deleteTaskToCategorie(Long taskId, Long categorieId) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Categorie categorie = entityManager.find(Categorie.class, categorieId);
            Task task = entityManager.find(Task.class, taskId);

            if (categorie != null && task != null) {
                categorie.getTaskList().remove(task);
                entityManager.merge(categorie);
                transaction.commit();

                List<Task> tasks = categorie.getTaskList();
                entityManager.close();
                return tasks;
            } else {
                transaction.rollback();
                entityManager.close();
                return Collections.emptyList();
            }
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            entityManager.close();
            return Collections.emptyList();
        }
    }


}
