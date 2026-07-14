/*
A **thread** is the smallest unit of execution within an operating system. Think of it as a single sequence of instructions that the CPU follows.

When you run an application (like a web browser or a game), that application is called a **Process**. A single process can spawn multiple **Threads** to handle different tasks at the same time.

---

### Process vs. Thread: The Core Difference

To understand threads, it helps to see how they live inside a process:

* **Process:** An independent execution environment. It has its own private memory space (heap). If you open two separate instances of an app, they don't share memory.
* **Thread:** A subset of a process. Threads living inside the *same* process share that process's memory and resources. This makes communication between threads incredibly fast, but it also means they can accidentally overwrite each other's data if you aren't careful.

---

### Why Do We Use Threads? (Multithreading)

Without threads, a program runs sequentially (one line of code after another). If one task takes a long time, the whole program freezes. Threads allow for **Multithreading**:

1. **Responsive UIs:** In a video game or desktop app, one thread handles the graphics and user clicks (so the app doesn't freeze), while another thread downloads data or processes logic in the background.
2. **Efficient Web Servers:** When thousands of people visit a website simultaneously, the server doesn't handle them one by one. It creates a new thread for each user request so everyone gets a response quickly.
3. **Better CPU Utilization:** Modern computers have multi-core processors. Multiple threads allow a single program to split its work across all available CPU cores at the exact same time.

---

### The Thread Lifecycle

A thread goes through several distinct states during its brief existence:

1. **New:** The thread object is created, but it hasn’t started executing yet.
2. **Runnable:** The thread is ready to run and waiting for its turn on the CPU (managed by the operating system's scheduler).
3. **Running:** The CPU is actively executing the thread's code.
4. **Blocked / Waiting:** The thread is temporarily paused. It might be waiting for user input, a file to download, or for another thread to finish.
5. **Terminated:** The thread has completed its task or was forced to stop. Once dead, it cannot be restarted.

---

### Common Challenges with Threads

While incredibly powerful, working with multiple threads introduces complex bugs:

* **Race Conditions:** When two threads try to modify the exact same variable at the exact same time, causing corrupted data.
* **Deadlocks:** When Thread A is waiting for Thread B to finish, but Thread B is waiting for Thread A to finish. They trap each other in a permanent standoff.
*/


// 1. Define the custom thread class
class WorkerThread extends Thread {
    private String threadName;

    public WorkerThread(String name) {
        this.threadName = name;
    }

    // 2. Override the run() method to define the thread's task
    @Override
    public void run() {
        System.out.println(threadName + " is starting.");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(threadName + " is processing item " + i);
                Thread.sleep(1000); // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " has finished.");
    }
}

// Main execution
class Main {
    public static void main(String[] args) {
        // 3. Create thread instances
        WorkerThread thread1 = new WorkerThread("Thread-A");
        WorkerThread thread2 = new WorkerThread("Thread-B");

        // 4. Start the threads
        thread1.start();
        thread2.start();
    }
}

