//package AdvanceJava;

/*Types of Interface:-
1. Normal interface
	- an interface having two or more methods
2. Functional interface (SAM)
	- SAM => Single Abstract Method interface
3. Marker interface
	- an interface that as no methods (blank interface)
*/

//@FunctionalInterface
interface SpeedTester {
    // The single abstract method
    void testSpeed(int speed); 

    // You can have default methods!
    default void logData() {
        System.out.println("Logging data...");
    }

    // You can have static methods too!
    static void ShowVersion() {
        System.out.println("Version 1.0");
    }
}
