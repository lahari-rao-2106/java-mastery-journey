class Strings{
    public static void main(String[] args) {
    //string is a sequence of characters
   //it is a class in java  , its not  a primitive data type
    String name="Lari"; //string literal , moslty used format
    
    String name1=new String("Lari"); //second representation format 
                                               // as String is also a claas rather than primitive data type
    //Methos that can be performed on string
    System.out.println("Length: " + name.length()); //length of string
    System.out.println("charAt index 0 is: " +name1.charAt(0)); //character at index 0
    System.out.println("Unique code: "+ name.hashCode()); //every stirng has unique hasscode value"
    System.out.println(name.concat(" rao"));

/*  =========BTS ===========================
 -->in heap memory thee is special place for all string literals
 --> that is called string constant pool
 -->as soon as value is assigned to name , that value is stored in string constant pool
-->and "name" , resides in stack memory with the address of value "Lari"
-->Now after compiling line 7 , name1 resides in stack and it needs vaddress of its value .
--> compiler checks whther "Lari" is already present in string constant pool or not
-->as "Lari" is already present in string constant pool , compiler just gives the address of "Lari" to name1
-->NO 2 objects with same value will be created in string constant pool
 
*/
 }
}
// Testing my green contribution graph square
