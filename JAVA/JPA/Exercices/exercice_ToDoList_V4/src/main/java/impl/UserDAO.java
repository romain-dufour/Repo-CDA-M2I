package impl;

import dao.BaseDAO;
import model.Task;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAO extends BaseDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercice_ToDoList");

    @Override
    public boolean add(Object element) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public List get() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Task> taskList = null;

        try{
            taskList = em.createQuery("select t from Task t where :utilisateur_id  ",Task.class)
                    .getResultList();

            for (Task t : taskList){
                System.out.println(t.toString());;
            }
            em.getTransaction().commit();
        }catch (Exception e){
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }finally {
            em.close();
        }

        return taskList;
    }

    public List getTasksByUser(long id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Task> taskList = null;
        try{
            taskList = em.createQuery("select t from Task t where user.id = :id ",Task.class)
                    .setParameter("id",id)
                    .getResultList();

            em.getTransaction().commit();
        }catch (Exception e){
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }finally {
            em.close();
        }

        return taskList;
    }

    @Override
    public boolean markAsCompleted(Object element) {
        return false;
    }

    @Override
    public boolean delete(Object element) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            User user = em.find(User.class, element);
            em.remove(user);
            em.getTransaction().commit();
            return true;
        } catch (EnumConstantNotPresentException e) {
            em.close();
            return false;
        }
    }
}
