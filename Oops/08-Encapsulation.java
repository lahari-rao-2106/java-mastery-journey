package Oops;
/*
-->Encapsulation is a process of keeping data/methods hidden from outside world
-->Encapsulation is achieved by using access modifiers "private"
-->Encapsulation is also known as data hiding
-->the private variables can only be accessed with in the same class
-->to access in other classes there is an indirect way
-->Indirect way : Methods 
-->getter and setter methods
-->=====================================
-->instead of get and set we can also abc , xyz 
-->But code readability is very important in programming
-->we should ensure resders should understand our intention by looking at method name
-->Getters and Setters are thus prefered
-->they are user defined btw , not inbuilt/predefined methods.
*/
class Human
{
	int age;//instance variable , it belongs to object
	String name; 
    private int age_2;     //it is a class variable , only belongs to class
     private String name_2;// all the staticj variables are stored in seperate space in heap
                           // all the objects just refer to that single variable
   

    public int getAge() {
        return age_2;
    }
    public void setAge(int a) {
        age_2=a;
    }
    public String getName() {
        return name_2;
    }
    public void setName(String n) {
        name_2=n;
    }
    
    
}

class Encapsulation {
	public static void main(String[] args) throws ClassNotFoundException
	{Human obj=new Human();
        obj.age=11;                    //how we access normal variables
		obj.name="LARI";
		System.out.println(obj.name+" : " +obj.age);

        obj.setAge(19);            //how we access private variables 
        obj.setName("LARI");
        System.out.println(obj.getName()+" : " +obj.getAge());

	
	}
}
