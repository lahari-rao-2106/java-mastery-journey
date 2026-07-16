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
*/

import java.io.IOException;

class Thread_1 implements Runnable {
    public void run()
    {
        try
         {
             for(int i =0 ;i<50;i++)
             { System.out.println("Thread-1 is running");
             Thread.sleep(20);
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
            Thread.sleep(20);
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
}    
}
