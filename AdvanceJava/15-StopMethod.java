class MyThread extends Thread {

    public void run() {

        int i = 1;

        while (true) {

            System.out.println("Running : " + i);

            i++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class StopMethod {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t1.stop();

        System.out.println("Thread stopped.");
    }
}