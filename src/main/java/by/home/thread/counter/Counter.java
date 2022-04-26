package by.home.thread.counter;

public class Counter {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public synchronized void increment(){
            counter++;
    }
}
