package dao;

import model.Task;

import java.util.List;

public abstract class BaseDAO <T>{


    public abstract boolean addTask(Task element);

    public abstract List<Task> getAllTasks();
    public abstract boolean markTaskAsCompleted(Long id);
    public abstract boolean deleteTask(Long id);


}
