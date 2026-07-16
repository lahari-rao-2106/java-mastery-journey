/*
-->Now the we are desired to print thread-1 and thread-2 simultaneously 
--> thread-2 must be print after every thread-1
 

========== Errors i made ===========
uuushhhhhhhhhhhhhhhhhh 
1) Runnable reference , user defined class objects 
2) the runnable referenceeeed object must be psses s parameter to  pre defined THREAD class 
not user defined class

========== Things i understood=========
1) but still we dont get the exact desired output 



Even with Thread.sleep() and Thread.yield(), this output is still not guaranteed.
The scheduler might still produce:
Thread-1 : 1
Thread-1 : 2
Thread-1 : 3...
Thread-2 : 1
Thread-2 : ... or any other ordering.

If you want exactly this output:
Thread-1
Thread-2
Thread-1
Thread-2
Thread-1
Thread-2
...

then sleep() is not enough. You need synchronization using mechanisms such as:

wait() / notify()
Semaphore
Lock and Condition

Those allow one thread to explicitly hand over execution to the other, producing a deterministic alternating sequence.


========== Things i have to work on ===========
still not able to pritn desired output 
*/

import java.io.IOException;

class Thread_1 implements Runnable {
    public void run()
    {
        try
         {
             for(int i =0 ;i<50;i++)
             { System.out.println("Thread-1 is running");
             Thread.sleep(10);
             } 
        }
        catch(Exception e)
        {
           System.out.println("OOPs , there's a error called...."+e);
        }
    }
}

class Thread_2 implements Runnable{

    public void run(){
        try {

        for(int i =0 ;i<50;i++){
            System.out.println("Thread-2 is running");
            Thread.sleep(10);
        }
    } 
    catch(Exception e){
        System.out.println("Ooooops " +e);
    }
}
}

class SleepMethod {
public static void main(String[] args) throws InterruptedException {
    Runnable r1 = new Thread_1();
    Runnable r2 = new Thread_2();
     
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();

    t1.wait();
    t2.wait();
 
   // ============ Anonymous inner Class =============
   Runnable r3 = ()->
   {
     for(int i=1;i<=5;i++)
    		{
    			System.out.println("thread-3 is running");
    			try {Thread.sleep(10);}catch(InterruptedException e) {e.printStackTrace();}
    		}
   };
   Thread t3 = new Thread(r3);
    t3.start();
        
}    
}
