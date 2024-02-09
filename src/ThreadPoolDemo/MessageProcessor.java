package ThreadPoolDemo;

import java.sql.SQLOutput;

public class MessageProcessor implements Runnable{
    final int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " [RECEIVED] New message received: " + message);

        // Here we could put some processing for the message or some operation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " (DONE) Message processed: " + message);

    }
}
