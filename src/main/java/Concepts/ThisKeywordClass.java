package Concepts;

public class ThisKeywordClass {
/*'This' keyword refers to current object and this object, object scope lies in class level

 */
    int a=2;

    public void getData(){
        int a=3;

        int b = a+this.a;

        //print local variable
        System.out.println("Local variable: "+a);
       //print global variable accessing with keyword 'this'
        System.out.println("Global variable: "+this.a);
        //print sum of global and local variable
        System.out.println("Sum of both variables: "+b);

    }


    public static void main(String [] args) {

        ThisKeywordClass td = new ThisKeywordClass();
        td.getData();

    }
}
