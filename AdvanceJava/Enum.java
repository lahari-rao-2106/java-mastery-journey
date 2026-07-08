
enum Status{
    Running , Loading , Pending , Successful; // these are objects 
                                              // also refered NAMED CONSTANTS 
                                              //these are used when we want to return Status to a usaer rather than fixed strings objects 
}
public class Enum {
    Status s=Status.Running ; //Accessing the named constants using enum class
                            //output is Running  
                            //we cannot access objects if they are not initialized in enum class
    //=======syntax to access all the named constants with single variable ===========
    //ie its an array 
    Status[] s1= Status.values();

}
