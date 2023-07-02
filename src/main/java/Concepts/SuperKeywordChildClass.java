package Concepts;

public class SuperKeywordChildClass extends SuperKeywordParentClass {
/*'Super' keyword actually refers to the parent class
    This way is possible to access methods and variables
    Whenever use super constructor it should always be the first line in the child constructor
 */
String name ="javaTraining";

    public void getStringData(){
        System.out.println(name);//Prints name in local variable
        System.out.println(super.name);//Prints name variable in parent class
    }

    public void getData(){

        //If required to use method in parent class use super keyword
        super.getData();
        //method in parent class is overwritten and getData method in child class is used
        System.out.println("Method in superChildClass");
    }

    public SuperKeywordChildClass(){
        //access the construction in parent class
        //constructor in parent class should be always first line before child constructor
        super();
        System.out.println("Child class constructor");
    };


    public static void main(String [] args) {

        SuperKeywordChildClass cd = new SuperKeywordChildClass();
        //The result is giving preference to the local variable
        // rather than the one in parent class unless called within the method itself
        cd.getStringData();

        //Inherit method from parent class
        cd.getData();

    }
}
