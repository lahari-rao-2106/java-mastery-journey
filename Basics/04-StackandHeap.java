//package Basics;
class Calculator
{
	int num=5; //instance variable or non static variable or field
              //so its stored in heap memory and and obj is created inside heap to store this and also many more things andeach object will have its own copy of this variable
			  //these are local variables and they are stored in stack memory and they are created when the method is called and destroyed when the method is exited
			  //we just called these variables . didnt create them so they are created in stack memory and they are destroyed when the method is exited
	public int add(int n1, int n2) //add is also stored  in oject heap memory
	{                              
		System.out.println(num);
		return n1+n2; 
	}
}
class StackandHeap {
	public static void main(String[] args) {
		//int data=10; //local variable but why? because it is created when the main method is called and destroyed when the main method is exited
		Calculator obj=new Calculator(); //obj is not object its a reference variable
		                                 // first it is created inside heap like a box with rows and has address
										 // then this obj is stroed in stack with its address as its value and this address is used to access the object in heap memory
		Calculator obj1=new Calculator();//different table and address for this in heap
		//int r1=obj.add(3,4); //local variable
		//System.out.println(r1);
		obj.num=8;       // breaking glass of one samsung phone doesnt break all other samsung phones glasses 
		                // samsung is num and each phone is obj
		
		System.out.println(obj.num); // 8
		System.out.println(obj1.num);// 5
	}
}