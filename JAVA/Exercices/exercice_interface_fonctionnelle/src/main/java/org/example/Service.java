package org.example;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static List<Product>filterProducts (List<Product> productList,CritereFiltrage critere){

        List<Product> filteredProductList = new ArrayList<>();

        for (Product product : productList) {
            if (critere.filter(product)) {
                filteredProductList.add(product);
            }
        }
        return filteredProductList;
    }
}
