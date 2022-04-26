package by.home.thread.except;

public class SimpleThreadDemo  {
    public static void main(String[ ] args) {
        new SimpleThread().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
