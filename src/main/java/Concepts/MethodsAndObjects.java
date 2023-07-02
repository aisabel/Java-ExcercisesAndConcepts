package Concepts;

public class MethodsAndObjects {
   /* Method: A collection of code statements that perform a specific task
        * Help to eliminate redundancy in code.
        * A method can only return one value
        * Methods contain return types ('void'), but also can contain int, string, etc.
        * Return type→ int indicates the data type value that will be returned back to the code that calls it (int in this case)
        * No methods are allowed inside the main block
        *
    * Objects are instances of a class. Call the methods with the help of objects.
    * Its also called an instance of a class
        * Objects need to allocate memory.
        * Memory can be allocated with the help of 'new' operator and provide class name.
        * Syntax: Return class name -> Object name = new operator ->class name
        * Call the method with the object with syntax: objectName.methodName();
   */

    //General method with return type void as default
    public void getData(){
        System.out.println("This is a method with void");
    }

    //Method with return type int
    public int getDataInt(int number){
        System.out.println("This is a method with return type int");
        return number;
    }

    public static void main (String [] args) {
        //Object created
        //Syntax: class name -> Object name = new operator ->class name
        MethodsAndObjects myObject = new MethodsAndObjects();

        //Access the getData method using the myObject
        //objectname.methodName();
        //This will print or execute anything in getData method
        myObject.getData();

        //Access the getDataInt method using the myObject
        //objectname.methodName();
        //This will print or execute anything in getDataInt method
        myObject.getDataInt(5);

    }
}

