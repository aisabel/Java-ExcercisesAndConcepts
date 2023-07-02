package Concepts;

public class PolymorphismWithOverloading {
    /* Polymorphism refers to the ability of a class to provide different implementations of a method,
    depending on the type of object that is passed to the method.

    Overload:  multiple methods can have the same name but different parameters.
    Rules to overload a function:
        1.Either argument count should be different or
        2.Argument data type should be different


        Overriding: both functions have same method name and arguments.
        The preference is to use the function within the same class and replace the one in parent class.
        Overriding occurs when a subclass (child class) has the same method as the parent class

     */
    public void getData(int a){
        System.out.println(a);
    }
    public void getData(String a){
        System.out.println(a);
    }

    public static void main(String [] args) {

        PolymorphismWithOverloading cl = new PolymorphismWithOverloading();
        cl.getData(2);
        cl.getData("hello");


    }
}
