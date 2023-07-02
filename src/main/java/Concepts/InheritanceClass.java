package Concepts;

public class InheritanceClass {

    //POO Inheritance concept:
    //This class is in order to know how POO Inheritance works between classes
    //This class works related to the InheritanceMethod.java class


    public static void main(String [] args) {
        System.out.println("Navigate to home page");

        //Below we are creating an object ('myNewObject') based on the InheritanceMethod class
        // 'new' reserved word indicate memory allocation, that creates a method for parent class
        InheritanceMethod myNewObject = new InheritanceMethod();

        //Call to execute the method existing in the InheritanceMethod class
        myNewObject.ValidateHeader();

        //The outcome result will be printing both text: "Navigate to home page" and "Header validated"
        //This text exist and is inherited from inheritMethod class. No need to create it here, as it is inherited.
    }
}
