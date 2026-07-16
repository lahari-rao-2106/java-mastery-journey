/*
What is a Race Condition?
Textbook Definition

A race condition occurs when two or more threads access and modify 
the same shared resource simultaneously, and the final result depends
 on the order in which the threads execute.

In simple words:

Multiple threads are racing to access the same data.
 Since thread scheduling is unpredictable, the output may be incorrect or inconsistent.

*/

class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}

class RaceConditionDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + c.count);
    }
}