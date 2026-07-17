/*
Key Points to Remember
yield() belongs to the Thread class.
It is a static method.
It is only a suggestion to the thread scheduler.
It does not guarantee that another thread will execute.
The thread remains in the RUNNABLE state after calling yield().
 */


public @Deprecated
class Annotations
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show A");
	}
}

class B extends Annotations 
{
	@Override
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}

class Demo {
    public static void main(String[] args) {
    	
    	B obj=new B();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
}

