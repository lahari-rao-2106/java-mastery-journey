//package Basics;
import java.lang.Math; //importing math class from java.lang package
//import java.util.Random;
class ArrayConcept {
   public static void main (String args[]){
       int nums[][]=new int[3][4]; //declaration and instantiation of array

       //*****About Math Class================== */
         int random_1=(int)Math.random(); // it is a inbuilt class
                                        //it gives different outuput because of associativity
                                        //math is type casted before random is generted
                                        //so it gives default value ie 0 as output
          int random_2=(int)(Math.random()); //here math.random is type casted after random value is generated
                                            // as random values are already generated it gives random integers as output
        System.out.println(random_1);
        System.out.println(random_2);
        //****=============================== */
       for(int i=0;i<3;i++)
       { for(int j=0 ; j <=3 ; j++)
        {   
            nums[i][j]=(int)Math.random()   ; //initialization of array
            System.out.print(nums[i][j]+" ");
        }
        System.out.println();
        }
        for(int i=0;i<3;i++)
       { for(int j=0 ; j <=3 ; j++)
        {   
            nums[i][j]=(int)(Math.random())   ; //initialization of array
            System.out.print(nums[i][j]+" ");
        }
        System.out.println();
        }
   }
}
