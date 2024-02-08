package producer_consumer;

import java.util.List;

public class Producer implements Runnable{
    List<Integer> questionList = null;
    final int LIMIT = 5;
    int noQuestion = 0;
    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestions(int noQuestion) throws InterruptedException {
        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                System.out.println("Question piled up... Waiting for consumer to answer questions...");

                // this wait will make this thread stop here, until other thread notifies it to continue
                questionList.wait();
            }
        synchronized (questionList) {
            System.out.println("New question: "+ noQuestion);
            questionList.add(noQuestion);
            Thread.sleep(10);

            // Notify thread which is waiting on this object
            questionList.notify();
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.readQuestions(noQuestion++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
