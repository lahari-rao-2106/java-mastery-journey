/*
The throw keyword in Java is used to explicitly throw an exception
 during the execution of a program. It creates an exception object and transfers 
 control to the nearest matching catch block or to the JVM if the exception is not handled.
*/
class Demo {

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        checkAge(16);

    }
}