package MultiThread;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateProducts();
            }
        });
        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displayProducts();
            }
        });

        // The display task will only display the products added before the
        // sleep ends
        inventoryTask.start();
        // Primitive way of managing threads
        Thread.sleep(2000);
        displayTask.start();
    }

}
