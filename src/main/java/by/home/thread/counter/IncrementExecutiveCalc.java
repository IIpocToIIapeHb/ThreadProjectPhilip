package by.home.thread.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class IncrementExecutiveCalc implements IncrementInThreads{
    @Override
    public int incrementCalc(int numberOfThreads) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        final Counter counter = new Counter();

        List<Future<?>> futures = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            Runnable runnable = new Incrementor(counter);
            Future<?> future = executorService.submit(runnable);
            futures.add(future);
        }

        for (Future<?> future:futures){
            try {
                future.get();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
        return counter.getCounter();

    }
}
