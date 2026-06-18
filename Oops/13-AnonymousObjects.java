package Oops;
class A{
    public void show(){
        System.out.println("from class A , Show() method is being print ");
    }
}
class AnonymousObjects{
public static void main(String args[])
{
    A obj_1= new A(); // "new A()" , creates an object in heap as soon as this 10th line is complied
    obj_1.show();//obj_1 is called a refernce variable 
                 //cause it references the actual object created in heap in stack
    new A();/*this creates a new object
            -->and it is called anonymous object
            -->cause there is no reference existing in stack for this particular object
            -->the only problem with this type of object is we cannot reuse it
            */
    new A().show();//creates a new different object , also calls show
}
}