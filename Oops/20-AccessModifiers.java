package Oops;
class A {
    int m=10;
    public int m1=11;
    private int m2=12;
    protected int m3=13;
}
class B extends A{
    public static void main(String args[]){
        //ACCESS MOSDIFIER
        B obj = new B();
         System.out.println( obj.m); //default 
                                    //works for same file
                                     //same package sub and non sub class
                                     // doesnt work for different package sub and non subclass
         System.out.println(obj.m1); //public
                                     //works for same file
                                     //same package sub and non sub class
                                     //works for different package sub and non subclass
       //System.out.println(obj.m2); private
                                     //  this is error , cause m2 is declared private
                                     //only works for same class , not even diff class of same file , then we have to go with indirect method
                                     //doest work for same package sub and non sub class
                                     // doesnt work for different package sub and non subclass
         System.out.println(obj.m3); //protected 
                                     //works for same file 2 different classes 
                                     // same package sub and non sub class
                                     // doesnt work for different package subclass
                                     //doesnt work for different package non -subclass (only this situation)

        
    }
}


