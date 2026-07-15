/*
1. Even and Odd Threads ⭐

Create two threads:

Thread-1 prints even numbers (2–20)
Thread-2 prints odd numbers (1–19)


*/
class EvenThread extends Thread {

    public void run() {

        System.out.println("Even Numbers:");

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {

    public void run() {

        System.out.println("Odd Numbers:");

        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
        }
    }
}

class EvenOddThreads {

    public static void main(String[] args) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}