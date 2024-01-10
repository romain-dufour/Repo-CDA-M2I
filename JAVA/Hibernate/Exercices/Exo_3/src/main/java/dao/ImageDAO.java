package dao;

import model.Image;
import model.Produit;

import java.time.LocalDate;
import java.util.List;

public interface ImageDAO {

    public void add(Image image);

    public void deleteImage(Long imageId);

    public void updateImage(Long imageId);

    public List<Image> getImageList();


}
