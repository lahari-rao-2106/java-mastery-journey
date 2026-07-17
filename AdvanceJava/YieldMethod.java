class Thread1 implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread-1 : " + i);

            Thread.yield();
        }
    }
}

class Thread2 implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread-2 : " + i);

            Thread.yield();
        }
    }
}

public class YieldMethod {

    public static void main(String[] args) {

        Runnable r1 = new Thread1();
        Runnable r2 = new Thread2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}