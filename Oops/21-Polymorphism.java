package Oops;
class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C");
    }
}

class Polymorphism {
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();

        obj=new B(); //type is still A , but implmentation is B
        obj.show(); // this is called dynamic dispatch . only possible in case of inheritance

        obj=new C(); // now reference variable is pointing to the address of "new C()"
        obj.show();


    }

    
}

 /*
 --> poly - many , morphism - forms (Aparichitudu , same reference acts diffeently based upon the situation)
 --> Polymorphism is about 2 types , runtime and compile time polymorphism.
 --> the whole thing above is about Run-time Polymorphism
 -->ie the system doesnt know which particular show( ) , to execute untill run time 
 --> in case of compile time Polymorphism , system will know which particular things get executed at the complile time itslef
  */