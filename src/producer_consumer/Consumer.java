package producer_consumer;

import java.util.List;

public class Consumer implements Runnable {
    List<Integer> questionList = null;

    public Consumer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void answerQuestions() throws InterruptedException {
        synchronized (questionList) {
            while (questionList.isEmpty()) {
                System.out.println("All question answered... Waiting for producer to bring new questions...");

                // this wait will make this thread stop here, until other thread notifies it to continue
                questionList.wait();
            }
            synchronized (questionList) {
                Thread.sleep(5000);
                System.out.println("ANSWERED: " + questionList.remove(0));

                // Notify thread which is waiting on this object
                questionList.notify();
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.answerQuestions();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
