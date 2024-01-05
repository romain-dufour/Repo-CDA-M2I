package dao;

import model.Categorie;
import model.Task;

import java.util.List;

public interface CategorieDAO {

    public boolean addCategorie(Categorie categorie);

    public List<Categorie> getAllCategorie();

    public boolean deleteCategorie(Long categorieId);

    public List<Task> gettasksByCategorie(Long categorieId);

    public List<Task> addTaskToCategorie(Long taskId, Long categorieId);

    public List<Task> deleteTaskToCategorie(Long taskId, Long categorieId);


}
