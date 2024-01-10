package impl;

import dao.ImageDAO;
import model.Image;
import model.Produit;
import org.hibernate.Session;

import java.util.List;

public class ImageDAOImpl extends BaseService implements ImageDAO {



    public ImageDAOImpl(){
        super();
    }

    public void begin(){
        session = sessionFactory.openSession();
    }

    public void end(){
        session.close();
    }
    @Override
    public void add(Image image) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(image);
        session.getTransaction().commit();

        session.close();
    }

    public Image getImageById(Long Id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Image image = session.get(Image.class,Id);
        return image;
    }

    @Override
    public void deleteImage(Long imageId) {

    }

    @Override
    public void updateImage(Long imageId) {

    }

    @Override
    public List<Image> getImageList() {
        return null;
    }
}
