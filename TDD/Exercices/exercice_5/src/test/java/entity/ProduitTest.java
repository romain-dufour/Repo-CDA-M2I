package entity;

import org.example.entity.Produit;
import org.example.exception.QualityTooHighException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProduitTest {

    Produit produit = new Produit();

//    -	Une fois la date de péremption est à zéro, la qualité se dégrade deux fois plus vite.
    @Test
    void whenDateIsEqualTo0QualityShouldDegradeTwoTimeFaster(){
        int sellInDay0 = 0;
        int coeffOfDecrease = 1;
        int quality = 50;
        int updateQualityAfterDay0 = produit.update(sellInDay0,quality,coeffOfDecrease);

        Assertions.assertEquals(48,updateQualityAfterDay0);

    }
//-	La qualité d'un article n'est jamais négative.
    @Test
    void QualityOfAnArticleCantBeNegative(){
        int quality = 0;
        int sellDay = 0;
        int coeff = 1;
        int updateQuality = produit.update(sellDay,quality,coeff);

        Assertions.assertTrue(updateQuality >= 0);
    }



//    -	La qualité d'un article n'est jamais supérieure à 50.

    @Test
    void QualityCantBeSuperiorOf50(){
        int quality = 51;
        Assertions.assertThrowsExactly(QualityTooHighException.class, () -> produit.setQuality(quality));
    }





//    -	La qualité du « brie vieilli » augmente à mesure qu'il vieillit.

    @Test
    void QualityBrieVieilliIncrease(){
        String name = "brie vieilli";
        int quality = 20;
        int updateQuality = produit.update(1,quality,1, name);
        Assertions.assertTrue(updateQuality>quality);
    }



//    -	Les produits laitiers se dégradent en qualité deux fois plus vite que les produits normaux

}
