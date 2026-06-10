
/**
class Calculator{
	int a;
	public int add(int n1, int n2)
	{
		int r=n1+n2;
		return r;
	}
}

public class Demo {

	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		Calculator calc= new Calculator();
		int result = calc.add(num1,num2);
		System.out.println(result);
	}
}
	**/

class Computer
{
	public void playMusic()
	{
		System.out.println("Music Playing...");
	}
	public String getMeAPen(int cost)
	{
		if(cost>=10)
			return "Pen";
		else
			return "Nothing";
	}
}


public class Methods {
	public static void main(String[] args) {
		Computer obj=new Computer();
		obj.playMusic();
		String src=obj.getMeAPen(10);
		System.out.println(src);
	}
}
/*
in line 34 even if else is not written ,
we might think both the return statements will execute but only one of them will execute based on the condition 
cause as soon as the onr return statement appears the control will come out of the method and rest of the code will not execute
the return value is given to function caller and the function caller can use that value for further processing
 */