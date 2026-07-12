/*
-->Interface is similar to a class 
-->but every variable is by default static and final
-->every method is by default public abstract 
-->So we cannot create object of interface , object must belong to the class which implemnts that particular interface
-->WHY DO WE NEED INTERFACE WHEN ABSTRACT CLASSES ALREADY EXISTS ???
                  |
				  |
				  V
-->So Java doesnt allow multiple inheritance in case of abstract classes 
-->But interfaces do allow multiple implementation . 

*/

interface A{
	//int age; it is error 
	int age=0;
	void show();
	void doNotShow();
}
class B implements A{ 
	public void show(){   //method must be ddeclared as public why ?? 
       System.out.println(" Showing abstract method from B Class");
	}
	public void doNotShow(){
      System.out.println("From class B");
	}
}
public class DemoInterface{
	public static void main(String args[]){
		A object = new B();
		//object.age=16;
		object.show();
		object.doNotShow();

	}
}

