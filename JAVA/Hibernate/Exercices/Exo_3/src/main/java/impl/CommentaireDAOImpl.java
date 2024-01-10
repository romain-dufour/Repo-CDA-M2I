package impl;

import dao.CommentaireDAO;
import model.Commentaire;
import model.Image;
import model.Produit;
import org.hibernate.Session;

import java.util.List;

public class CommentaireDAOImpl extends BaseService implements  CommentaireDAO{

    public CommentaireDAOImpl(){
        super();
    }

    public void begin(){
        session = sessionFactory.openSession();
    }

    public void end(){
        session.close();
    }
    @Override
    public void add(Commentaire commentaire) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(commentaire);
        session.getTransaction().commit();

        session.close();
    }

    public Commentaire getCommentaireById(Long Id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Commentaire commentaire = session.get(Commentaire.class,Id);
        return commentaire;
    }
    @Override
    public void deleteCommentaire(Long commentaireId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Commentaire commentaire = session.get(Commentaire.class,commentaireId);
        session.delete(commentaire);
        session.getTransaction().commit();

        session.close();

    }

    @Override
    public void updateCommentaire(Long commentaireId) {

    }

    @Override
    public List<Commentaire> getCommentaireList() {
        return null;
    }
}
