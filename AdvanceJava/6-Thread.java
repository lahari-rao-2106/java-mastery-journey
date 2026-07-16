/*
-->Threads are used for doing multi-taksing or mutliple works at the same time or parallel execution 
-->Thread is inbuilt class in java that extends runnable interface 
-->SO IF we wanat to use thread related charateristics in a class the class must extend the THREAD class .
-->this sub class must contain run() method , which is invoked with start() method 
-->run() method belongs to runnable interface and its an functional interface (contains single method)

============ Errors i made ==========
1) run method must be public
*/

class Thread_1 extends Thread{
    public void run(){
        for(int i =0 ;i<5;i++)
            System.out.println("hi");
    } 

}