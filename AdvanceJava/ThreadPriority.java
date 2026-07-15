/*
2. Thread Priority ⭐

Q2. Create three threads and assign:

MIN_PRIORITY
NORM_PRIORITY
MAX_PRIORITY

Print each thread's name and priority.


*/


class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    public void run() {

        System.out.println("Thread Name : " + getName());
        System.out.println("Priority : " + getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> " + i);
        }
    }
}

class PriorityDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Low");
        MyThread t2 = new MyThread("Normal");
        MyThread t3 = new MyThread("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}