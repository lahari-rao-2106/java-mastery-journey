/*
Why do we use join()?
Execute threads in sequence.
Wait for one thread to finish before starting another.
Ensure dependent tasks run in order.
*/class FirstThread implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread-1 : " + i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SecondThread implements Runnable {

    public void run() {

        for (int i = 6; i <= 10; i++) {

            System.out.println("Thread-2 : " + i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class JoinMethod {

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new FirstThread();
        Runnable r2 = new SecondThread();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();

        t1.join();

        t2.start();
    }
}