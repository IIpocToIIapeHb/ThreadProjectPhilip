package by.home.thread;

public class PriorThread extends Thread{

    public PriorThread(String name) {
       super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(0); // попробовать sleep(0),sleep(10)
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }

    }
}
