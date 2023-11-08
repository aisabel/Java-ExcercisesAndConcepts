package CommonDataStructuresAndAlgorithms;

public class RecursionFactorialExample {
    /*
        Finding Factorial is an example of recursion
        1! = 1
        2! = 2x1
        3! = 3x2x1
        4! = 4x3x2x1
        5! = 5x4x3x2x1 = 120

        5 = (4x3x2x1) = 4! = 24
        4 x3! = 6
        3 x2! = 2
        2 x 1! = 1
     */

    public static void main(String[] args) {

        int fact_value =Factorial(5);
        System.out.println("Factorial of all elements is "+fact_value);//120

    }

    private static int Factorial(int n){
        if(n==1) { //Base case(the small version of the problem) = zero index we have value= 1
            return 1; //returns = 1 value, ensuring recursion terminates.
        }
        //When method calls itself several times, its called recursion.
        return n  * Factorial(n-1); //Recursive case
    }
}
