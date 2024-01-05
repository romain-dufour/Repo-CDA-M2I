package dao;

import model.Task;

import java.util.List;

public abstract class BaseDAO <T>{


    public abstract boolean add(T element);

    public abstract List<T> get();

    public abstract boolean markAsCompleted(T element);
    public abstract boolean delete(T element);


}
