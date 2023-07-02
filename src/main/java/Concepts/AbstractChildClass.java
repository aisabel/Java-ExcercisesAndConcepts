package Concepts;

public class AbstractChildClass extends AbstractParentClass {

    /* Objects can be used to access to the methods in the parent class
        *however is not possible to create an object to instantiate/access to a method within the child class
        *  Example: AbstractParentClass myObject =  new AbstractParentClass();
        * Because is defined as an abstract class! 'public abstract class'
        *
        * Abstract classes can not be instantiated by any object
        *
        * Abstract class contains abstract methods, concrete methods or both
        * Except private we can have any access modifier for methods in abstract class
        * Except private variables can have any access modifiers
        * To implement abstract class we use 'extends' keyword
     */
    @Override
    public void bodyColor() {
        System.out.println("Abstract method: aircraft");
    }

    public static void main (String [] args){

        //Object will allow to access the methods in the class
        AbstractChildClass myObject =  new AbstractChildClass();

        //accessing to abstract method in the AbstractParentClass
        myObject.bodyColor();

        ////accessing to the other methods existing in the AbstractParentClass
        myObject.engine();
        myObject.safetyGuidelines();

    }
}
