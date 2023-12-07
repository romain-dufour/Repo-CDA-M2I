package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Product product = new Product(100);
        StockManager stockManager = new StockManager();
        Supplier supplier = new Supplier();

        product.registerObserver(stockManager);
        product.registerObserver(supplier);

        product.stockLevelModification(15);
//        supplier.update(15);
//        stockManager.update(10);
        product.stockLevelModification(5);
//        supplier.update();
//        stockManager.update(20);
        product.removeObserver(supplier);
        product.stockLevelModification(20);

//        supplier.update(product.getStockLevel());
//        stockManager.update(25);


        // c'est le changement de stock qui appelle le update chez les observateurs présent dans la arrayList, dans ce cas le stockManager et le supplier
    }
}