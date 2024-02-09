package ThreadPoolDemo;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class UsingThreadPool {
    public static void main(String[] args) {
        // This executor manages all Threads and runnable tasks assigned to it
        ExecutorService executor = Executors.newFixedThreadPool(8);

        Runnable t1 = new MessageProcessor(0);
        executor.execute(t1);
        Runnable t2 = new MessageProcessor(1);
        executor.execute(t2);
        Runnable t3 = new MessageProcessor(2);
        executor.execute(t3);
        Runnable t4 = new MessageProcessor(3);
        executor.execute(t4);
        Runnable t5 = new MessageProcessor(4);
        executor.execute(t5);
        Runnable t6 = new MessageProcessor(5);
        executor.execute(t6);
        Runnable t7 = new MessageProcessor(6);
        executor.execute(t7);
        Runnable t8 = new MessageProcessor(7);
        executor.execute(t8);

        executor.shutdown(); // makes the executor end when all tasks end
        while(!executor.isShutdown()) {

        }
        System.out.println("DONE");

    }

}
