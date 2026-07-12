/*
-->these expressions are used to reduce the lenght of code when Anonymous inner class concept is used 
-->Only works with functional interface 
-->cause while implwmwntion anonymous inner class , we dont mention any method name . 
--> SO the implementation can be of anly one mehtod 
-->if two mehtods exists in interface(Normal interface)  , ambiguity arises 
-->So this concept is only used in case of Functional Interfaces 
*/
import java.lang.FunctionalInterface;

@FunctionalInterface  //This is called annotations
                      // annotations helps us to find the errors easily 
                    // like here we want to use lambda expressions , so the interface must contain only one method 
                    //there arises no error if interface has more than one method if NO annotations are used
interface A{
   void show();
}

@FunctionalInterface
interface B{
    int add(int i,int j);
}
public class LambdaExpressions {
    public static void main(String args[]){
    A obj = ()->
    {
       System.out.println("SHOW() is accessed without any subclass of interface");

    };     //semicolon is mandatory 
    obj.show();

    //=========== we can still reduce the number of lines if we have only one line to code==========
    A obj1=()->System.out.println("SHOW() is accessed without any subclass of interface");
  //=======================================================================================
     obj1.show();
  //now what if method accepts parameters ;
  B obj2= (a,b)->a+b;
     int num=obj2.add(2,1);
      System.out.println(num);



    }

}
