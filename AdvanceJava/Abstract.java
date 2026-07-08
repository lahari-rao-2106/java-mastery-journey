
/*
-->Abstract methods can only be defined in abstract class 
--> abstract methods are used if we dont want to define the implementation in parent class 
-->the child class extending this class must define each and every abstratc method
--> we cannot further create an object of parent class
-->parent can refer the object but object should be of child 
*/
public abstract class Abstract {   //a class representing abstract methods must be itslef abstract
     public abstract void show();
    public abstract void load();
    
}

class B extends Abstract{
    public void show(){
       System.out.println("defining show() in child class"); 
    }
    public void load(){
       System.out.println("defining load() in child class"); 
    }
}
class Demo{
    public static void main(String args[]){
        //Abstract obj = new Abstract(); we cannot do this   
        Abstract obj = new B(); // object must be of child class 
                                //parent can reference the obj , but the implementation must come from child 
        obj.show();
        obj.load();

    }                           
}