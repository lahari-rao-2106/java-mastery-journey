package Oops;
/*
-->here i didnt define any advance calculator
-->i just called the package of Oops which contains the defintion of AdvCalculator in it 
-->And this is an example of aingle inheritance

--> ***JAVA doesn't support MULTUPLE INHERITANCE****
*/

class Inheritance {
    public static void main(String args[])
    {
        AdvCalculator obj = new AdvCalculator();
         int r1=obj.add(3,4);
         int r2=obj.sub(3,4);
         int r3=obj.mul(3,4);
         double r4=obj.div(3,4);

         System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }
    
}
