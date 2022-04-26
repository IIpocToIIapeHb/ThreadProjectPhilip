package by.home.thread.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    private final static int NUMBER_OF_THREADS = 10;

    public static void main(String[] args) throws InterruptedException {

        IncrementSimpleCalc simpleCalc = new IncrementSimpleCalc();
        System.out.println(simpleCalc.incrementCalc(NUMBER_OF_THREADS));

        IncrementExecutiveCalc executiveCalc = new IncrementExecutiveCalc();
        System.out.println(executiveCalc.incrementCalc(NUMBER_OF_THREADS));
    }
}
