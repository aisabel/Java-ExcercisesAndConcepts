package Concepts;

public abstract class AbstractParentClass {

    /*POO Abstraction:
        *Methods are abstract, have no body. (concrete methods)
        *Basically abstraction keeps all the details hidden from the user.
        *If there's any method which is abstract, then the class will be treated as abstract class.
        *
        * This is also called partial abstraction

     */

    public void engine(){
        System.out.println("Access engine method");
    }

    public void safetyGuidelines(){
        System.out.println("Access safety method");
    }

    //abstract class
    public abstract void bodyColor();

    public static void main (String [] args) {

    }
}
