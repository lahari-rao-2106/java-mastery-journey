class MutableAndImmutable {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Immutable String
        String name = "John";
        System.out.println(name); // John
        name = name + " Doe";
    System.out.println(name); // John Doe 
        /*
        -->We are not changong the value of name here 
        -->Normal strings are immutable in java
        -->first John object is created (adress 101)
        --> this "john's" address is given to name in 4th line
        --> in 5th John Doe is te new object creted in hash (105)
        --> this new objects address is replaced in the place of "john" address in stack
        --> name addressin stack changes from 101 to 105 
               _____________________  
        101---|___  John  __________|
        105---|___  John Doe _______|
              |__________ __________|
                  HASH MEMORY
        */ 

        // **********Mutable String (StringBuffer and StringBuilder)**********
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // Default capacity is 16

        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1.capacity()); // Default capacity is 16 + length of string

       // sb=sb+ " World"; // error we cannot convert string builder to string and vice versa implicitly
       String str=sb.toString(); // we can convert string builder to string but not vice versa
       System.out.println(str); // Hello World

       //--->menthods of string builder
       System.out.println(sb1.length()); // length of string , capapcity are two different things

        sb1.append(" World"); //supports arguments , tostring doesnt support arguments
        System.out.println(sb1); // Hello World

        sb1.insert(5, " Java");
        System.out.println(sb1); // Hello Java World

        sb1.delete(5, 11);
        System.out.println(sb1); // Hello World etc........


    }
    
}
