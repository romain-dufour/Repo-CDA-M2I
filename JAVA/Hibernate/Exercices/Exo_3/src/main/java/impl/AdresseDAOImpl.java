package impl;

import dao.AdresseDAO;
import model.Adresse;
import org.hibernate.Session;

public class AdresseDAOImpl extends BaseService implements AdresseDAO {

    public AdresseDAOImpl(){
        super();
    }

    public void begin(){
        session = sessionFactory.openSession();
    }

    public void end(){
        session.close();
    }


    @Override
    public void add(Adresse adresse) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(adresse);
        session.getTransaction().commit();

        session.close();
    }
}
