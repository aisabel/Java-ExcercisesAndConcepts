package Concepts;

public class Constructor {
    /*Constructor executes a block of code whenever an object is created
        *Constructors are also used in general to initialize and define variables or properties
        *Constructor is invoked whenever you create an object
        *Constructor is like a method, but Constructor does not have any values, nor written type ('void')
        *Constructor name should be always equal to the class name.
        *If two or more constructors defined exist in a class, then will execute the ones being called
        * But if an object calls a Constructor that is not defined, then java will use inner implicit Constructor
        *If a class doesn't have a Constructor, compiler will call java inner implicit Constructor
        *
        * Syntax: access modifier: public → ConstructorName.
     */

    //Defined Constructor
    public Constructor(){
        System.out.println("This is defined Constructor");
    }

    /*This is a normal Method example just to demonstrate the difference, but is never used
    public void getData(){
        System.out.println("This is method");
    }
    */

    //Parametrized Constructor
    public Constructor(int a, int b){
        System.out.println("This is parametrized Constructor: "+a+" "+b);
    }

    public Constructor(String str){
        System.out.println("This is string Constructor: "+str);
    }

    public static void main (String [] args) {
        System.out.println("This is main block");

        //When create an object, defined Constructor is called
        Constructor cd = new Constructor();

        //When object contains the parameters values, then Constructor parametrized is called
        Constructor c = new Constructor(5,4);

        //When create an object parametrized, then that Constructor is called
        Constructor d = new Constructor("hello");

    }
}
