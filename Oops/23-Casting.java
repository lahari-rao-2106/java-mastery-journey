package Oops;
//import Oops.DynamicMethodDispatch;

class Casting {
    public static void main(String[] args) {
        N obj2= new N(); //B class refrence , B class object 
        obj2.show(); //method overridden 
        obj2.show1() ; // inheritance 
        obj2.show2(); // its own method 
       System.out.println();
        // B_ obj3= new A_();  Down Casting ( high ---> low)
        /*      |                           ( parent ---> child) parent obj  is being converted or type casted to child obj
                |
                |
        --> we are converting sub class object to super class object 
        --> implicitly its not possible casue we aare converting from low to high  
        --> above syntax is wrong 
        --> its to be done as mentioned below
        */
        M obj = new N();
        obj.show(); //  method overridden 
        obj.show1() ; // inheritance 
       //obj.show2(); // its error cause obj is of A class and it doesnt know show2() method
        System.out.println();


        N obj3=(N)obj; // explicitly we must mention 
        obj3.show(); //method overridden 
        obj3.show1() ; // inheritance 
        obj3.show2(); // its own method 

    }
    
}
