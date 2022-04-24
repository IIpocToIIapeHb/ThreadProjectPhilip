package by.home.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomiMain {


    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 10_000; i++) {
            new IncrementThread(counter).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.i);
    }
}


    class IncrementThread extends Thread {
        Counter counter;
        public IncrementThread(Counter counter){
            this.counter = counter;
        }
        public void run() {
               counter.increment();
        }
    }


        class Counter {
            int i;

            public synchronized void increment() {
                i++;
            }
        }

