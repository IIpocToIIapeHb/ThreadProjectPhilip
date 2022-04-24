package by.home.thread.counter;

public class Incrementor implements Runnable{

    private Counter counter;

    public Incrementor(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        counter.increment();
    }
}
