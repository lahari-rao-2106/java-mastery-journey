class Calculator
 { 
   int a;//what object knows : data
    int add(int num1,int num2)//passing the parameters to the method so that it can perform the addition operation on those numbers given by the user
     {                        //what object can do : behavior
        return num1 + num2;
     }
 }
public class CreatingClassAndObjects {
       public static void main(String[] args) {
        int num1=10;
        int num2=5;
        Calculator calc = new Calculator();

        calc.add(num1, num2); //passing the values to the method cause it should know which exact numbers it should add
        System.out.println("Sum is: " + calc.add(num1, num2));
    }
}
/*so the new things i learnt here are :
-->object has two main characteristics : data(what it knows) and behavior(what it  does)
-->like how a design is provided for table in real life, similarly object also needs a design and that design is called class in java
-->class is a blueprint or template for creating objects, it defines the properties and behaviors that the objects created from the class will have

-->passing arguments
-->constructor concpet used in creating object
*/
