package AdvanceJava;
/*
-->Inner class means a class inside a class 
-->and to call a class belonging to a class , we must take help of the object 
--> to access age variable we need an obj of InnerClass class
--> to access show() method of InnerCLass we need object 
-->Similarly to access innerclass B of the main class InnerClass we need an object too 
-->unless its static 
-->   syntax if inner class is not static =======> InnerClass obj = new InnerClass();
                                                    InnerClass.B obj1 = obj.new B();
-->   syntax if inner class is static   =======>   InnerClass.B obj1 = new InnerClass.B();
*/
class InnerClass
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}
	
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}


class  Demo{
    public static void main(String[] args) {
    	InnerClass obj=new InnerClass();
    	obj.show();
    	
//    	A.B obj1=obj.new B();
//    	obj1.config();
    	
    	InnerClass.B obj1=new InnerClass.B();
    	obj1.config();

    }
}
