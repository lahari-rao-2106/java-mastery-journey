/*

*/



class Shared {

    synchronized void waitingMethod() {

        System.out.println("Thread is going to wait...");

        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread resumed.");
    }
}

class WaitMethod {

    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            obj.waitingMethod();
        });

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (obj) {

                System.out.println("Calling notify()...");

                obj.notify();
            }
        });

        t1.start();
        t2.start();
    }
}