package by.home.thread;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.*;

public class WaitAndNotify {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {

     new Machine().start();
        new Operator().start();
    }

    static class Operator extends Thread{
        public void run(){
            Scanner scanner = new Scanner(System.in);
            while(true){
                synchronized (strings){
                    strings.add(scanner.nextLine());
                    strings.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Machine extends Thread{
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(strings.remove(0));
                }
            }
        }
    }

}
