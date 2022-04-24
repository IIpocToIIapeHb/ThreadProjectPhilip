package by.home.thread.counter;

import java.util.ArrayList;
import java.util.List;

public class IncrementSimpleCalc implements IncrementInThreads {

    @Override
    public int incrementCalc(int numberOfThreads) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        Counter counter = new Counter();

        for (int i = 0; i < numberOfThreads; i++) {
            Incrementor myThread = new Incrementor(counter);
            Thread thread = new Thread(myThread);
            thread.start();
            threads.add(thread);

        }

        for (Thread thread : threads) {
            thread.join();
        }

        return counter.getCounter();

    }
}
