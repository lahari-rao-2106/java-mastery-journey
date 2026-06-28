package Oops;
class A_{
    public void show(){  //show method of parent class
        System.out.println("Show method of parent class (class A)");
    }
    public void show1(){   //parent class method
        System.out.println("Show1 method of class A");
    }
}
class B_ extends A_{
    public void show(){     //method overriding
        System.out.println("Show method of child class (class B)");
    }
    public void show2(){    // child class method
        System.out.println("Show2 method of class B");
    }
}
class DynamicMethodDispatch{
    public static void main(String args[])
    {
        A_ obj=new A_(); //parent reference parent obj
        //System.out.println(obj.show());--> this is erro cause show returns a print statemnt , andd why am i putting a print inside print **dumbo**
        obj.show();//calls parent mehtod

        A_ obj1=new B_(); // parent reference , child obj
                        // data type of obj1 is A
                        //implementation is From B clas
                        // also known as upcasting
        obj1.show();
        
        

    }
}