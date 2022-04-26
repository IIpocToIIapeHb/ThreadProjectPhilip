package by.home.thread;

public class WalkRunnable  implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(1000);
                System.out.println("eeend");
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
