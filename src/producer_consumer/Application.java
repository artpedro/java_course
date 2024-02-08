package producer_consumer;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Obs: if we used an ArrayBlockingQueue here, we wouldn't need to hard code the add to last and get the first
        //      and it would automatically put threads to wait when the queue gets full or empty;
        //      BlockingQueue<Integer> list = new ArrayBlockingQueue<>();

        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.start();
        t2.start();
    }

}
