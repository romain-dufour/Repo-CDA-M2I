package impl;

import dao.BaseDAO;
import model.Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TaskDAO extends BaseDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercice_ToDoList");




    @Override
    public boolean addTask(Task element) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
        em.close();
        emf.close();

        return false;
    }

    @Override
    public List getAllTasks() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List<Task> taskList = null;
        taskList = em.createQuery("select t from Task t ",Task.class).getResultList();

        for (Task t : taskList){
            System.out.println(t.toString());;
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        return taskList;
    }

    @Override
    public boolean markTaskAsCompleted(Long id) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Task task = em.find(Task.class,id);
        task.setCompleted(true);

        em.getTransaction().commit();
        em.close();
        emf.close();
        return false;
    }

    @Override
    public boolean deleteTask(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Task task = em.find(Task.class,id);
        em.remove(task);
        em.getTransaction().commit();
        em.close();
        emf.close();

        return false;
    }
}
