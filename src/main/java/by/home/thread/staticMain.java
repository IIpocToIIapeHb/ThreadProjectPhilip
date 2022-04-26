package by.home.thread;

public class staticMain {
    public static void main(String[] args) throws InterruptedException {
        Resource.i = 5;
        MyThread myThread1 = new MyThread();
        myThread1.setName("one");
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(Resource.i);
    }
}

    class MyThread extends Thread {
        Resource resource;

        public void run() {
            Resource.changeStaticI();
            new Resource().changeI();
        }
    }


    class Resource{
        static int i;

        public static void changeStaticI(){
            synchronized (Resource.class){
                int i = Resource.i;
                if (Thread.currentThread().getName().equals("one"));
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }

        public  void changeI(){
            synchronized (this){
                int i = Resource.i;
                if (Thread.currentThread().getName().equals("one"));
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }

