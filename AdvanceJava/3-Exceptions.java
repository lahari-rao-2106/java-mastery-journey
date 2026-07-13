/*
Object class
  │
  ▼
Throwable class -------------->only class with 'able' suffix
   ├──────────────────────────────────────────────┐
   │                                              │
   ▼                                              ▼
 Error                                        Exception(*****SUPER CLASS FOR ALL EXCEPTIONS****)
(Errors that canot be handled)         (errors that can be anda should be handled)
   │                                              │
   │                                              ├──────────────────────────────────────────┐
   │                                              │                                          │
   ▼                                              ▼                                          ▼
VirtualMachineError                        RuntimeException(Unchecked)                     Checked Exceptions
                                         (No red line error if not handled)             (red line error is not handled)
   │                                              │                                          │
   ├── OutOfMemoryError                           ├── ArithmeticException                    ├── IOException
   └── StackOverflowError                         ├── NullPointerException                   │      ├── FileNotFoundException
                                                  ├── ArrayIndexOutOfBoundsException         │      ├── EOFException
LinkageError                                      ├── StringIndexOutOfBoundsException        │      └── InterruptedIOException
   ├── NoClassDefFoundError                       ├── NumberFormatException                  │
   └── UnsatisfiedLinkError                       ├── ClassCastException                     ├── SQLException
                                                  ├── IllegalArgumentException               ├── ClassNotFoundException
AssertionError                                    ├── IllegalStateException                  ├── InterruptedException
IOError                                           └── UnsupportedOperationException          ├── CloneNotSupportedException
AWTError                                                                                     ├── NoSuchMethodException
                                                                                             ├── NoSuchFieldException
                                                                                             ├── InstantiationException
                                                                                             └── ReflectiveOperationException



===============================================================================================================
-->errors are of 3 types . (compile time errors(easy) , logical errors(hard) , runtime errors)
--> in that only runtime errors can be / should be handled as a respomsible developer 
*/


class Exceptions {
    public static void main(String args[]){
//======== basic implementation =================
        int i =0;
        int j=0;
        int arr[] = new int[5];
        String str = null;
        try {
            j=20/i;  // if this block is not handled execution just stops here , no below line would be executed 
                     //Syntactically theres no error , theres no logical error , but program execution just stops 
                // this is known as runtime errors
            }
        catch(Exception e){
            System.out.println("Oooops!!!!!!"+e);   // prints the exact name of error 

                          }

//========= Mention exact exception that might occur =============
//========= try with multiple catch ===============================
     try {
        j=20/i;
        System.out.println(arr[1]);
        System.out.println(arr[5]);
        System.out.println(str.length());
     }
     catch(ArithmeticException e)
     { System.out.println("Arithemetic exception arises");}
     catch(ArrayIndexOutOfBoundsException e)
     {System.out.println("Stay in your limits");}
     catch(Exception e){     //good practice to catch unknown error 
        System.out.println("Unknown runtime error"+e);
     }







    }
    
}
