package MultiThread;

import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    // To make a list that can be accessed by multiples Threads at the same time
    // You must use a concurrent list, which each method is synchronized to be thread safe
    CopyOnWriteArrayList<Product> soldProducts = new CopyOnWriteArrayList<>();
    public void populateProducts() {
        for (int i = 0; i < 1000; i++ ) {
            Product prod = new Product(i, "test_product" + i);
            soldProducts.add(prod);
            System.out.println("ADDED: " + prod);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void displayProducts() {
        for (Product product : soldProducts) {
            System.out.println("Printing: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
