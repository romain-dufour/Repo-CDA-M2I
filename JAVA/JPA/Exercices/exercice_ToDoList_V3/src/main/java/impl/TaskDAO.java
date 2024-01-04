package impl;

import dao.BaseDAO;
import model.Task;

import javax.persistence.*;
import java.util.List;

public class TaskDAO extends BaseDAO {
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
        taskList = em.createQuery("select t from Task t ",Task.class).getResultList();

        for (Task t : taskList){
            System.out.println(t.toString());;
        }
        em.getTransaction().commit();
        em.close();

        return taskList;
    }

    @Override
    public boolean markAsCompleted(Object element) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Task task = em.find(Task.class,element);
            if(task != null){
                task.setCompleted(true);
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
            em.close();
        }

    }

    @Override
    public boolean delete(Object element) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Task task = em.find(Task.class,element);
            em.remove(task);
            em.getTransaction().commit();
            return true;
        }catch (EnumConstantNotPresentException e){
            em.close();
            return false;
        }

    }
}
