package MultiThread;

import sun.java2d.loops.GraphicsPrimitive;

public class Application {
    public static void main(String[] args) {


        Task thread1 = new Task("Thread A");
        System.out.println("Starting Thread A");
        thread1.start();
        Task thread2 = new Task("Thread B");
        System.out.println("Starting Thread B");
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        });
        // Starting third thread using anonymous class
        System.out.println("Starting Thread C");
        thread3.start();

        // Starting a thread for a Runnable task
        RawTask rawTask = new RawTask();
        Thread thread4 = new Thread(rawTask);
        System.out.println("Starting Thread D");
        thread4.start();

    }
}
class Task extends Thread {
    String name;
    public Task(String name) {
        this.name = name;
    }

    // Synchronized methods will execute all this commands without giving time to another Thread
    public synchronized void run() {

        // You can use synchronized like this too
        synchronized (this) {
            Thread.currentThread().setName(name);
            for (int i = 0; i < 100; i++) {
                System.out.println("number: " + i + "-" + Thread.currentThread().getName());
            }
        }
    }
}

class RawTask implements Runnable {

    @Override
    public void run() {
        System.out.println("RawTask running");
    }
}