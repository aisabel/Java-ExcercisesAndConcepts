package Concepts;

public interface trafficLightsInterface {
    /*Interface difference between interface and class is:
     that interface will have methods, but not a body.
     +Interfaces can only define signature of the method, not any other code.
     +Classes should define and implement the methods present in the interface
     +All access modifiers should be public as well in interface
     +All variables defined in interface are public by default, static or final
     +Interface uses 'implements' keyword
     +Interfaces do not have a constructor

     POO Concept Abstraction: This interface uses ONLY abstract methods.
     All the methods are abstract, have no body. (concrete methods)
     Basically abstraction keeps all the details hidden from the user.
     Interfaces are 100% abstracted.

     If in a class there's at least one abstract method (with or without body),
     it means the class is also abstract.

     Note: This interface uses TrafficLight class.
      Also,

      *This interface is called by trafficLights class
     */

    public void greenLight();
    public void redLight();
    public void yellowLight();
    public void trainSignal();
}
