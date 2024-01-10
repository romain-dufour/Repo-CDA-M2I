package dao;

import model.Commentaire;
import model.Image;

import java.util.List;

public interface CommentaireDAO {

    public void add(Commentaire commentaire);

    public void deleteCommentaire(Long commentaireId);

    public void updateCommentaire(Long commentaireId);

    public List<Commentaire> getCommentaireList();

}
