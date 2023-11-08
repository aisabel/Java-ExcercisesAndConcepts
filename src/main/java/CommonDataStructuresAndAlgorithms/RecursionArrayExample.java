package CommonDataStructuresAndAlgorithms;

public class RecursionArrayExample {
     /*
        Recursion: The process in which a function calls itself directly or indirectly
        is called recursion and the corresponding function is called a recursive function.

        A recursive function solves a particular problem by calling a copy of itself
        and solving smaller sub problems of the original problems.

        Explanation: Given int[] arr = {1,2,7,4,8};
        8 + SumOfDigits(1,2,7,4)
        4 + SumOfDigits(1,2,7)
        7 + SumOfDigits(1,2)
        2 + SumOfDigits(1)
        *Then 1 therefore is the smaller solution and smaller result.

        The algorithmic steps for implementing recursion in a function are as follows:

        Step1 - Define a base case: Identify the simplest case for which the solution is known or trivial.
        This is the stopping condition for the recursion, as it prevents the function from infinitely calling itself.

        Step2 - Define a recursive case: Define the problem in terms of smaller sub problems.
        Break the problem down into smaller versions of itself, and call the function recursively to solve each sub problem.

        Step3 - Ensure the recursion terminates: Make sure that the recursive function eventually reaches the base case,
        and does not enter an infinite loop.

        Step4 - Combine the solutions: Combine the solutions of the sub problems to solve the original problem.

      */
    static int[] arr = {1,2,7,4,8};
    public static void main(String[] args) {

        int value = SumOfDigits(arr.length-1);//get all including the zero index
        System.out.println("Sum of all elements is "+value);//Prints sum of all values = 22
    }

    private static int SumOfDigits(int n){
        if(n==0) //Base case(the small version of the problem) = zero index we have value= 1
            return arr[n]; //returns = 1 value, ensuring recursion terminates.

        //When method calls itself several times, its called recursion.
        return arr[n] + SumOfDigits(n-1); //Recursive case
    }
}
