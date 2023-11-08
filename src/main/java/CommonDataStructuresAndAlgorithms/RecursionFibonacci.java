package CommonDataStructuresAndAlgorithms;

public class RecursionFibonacci {
    /*
    The Fibonacci sequence is a set of steadily increasing numbers
    where each number is equal to the sum of the preceding two numbers.
    Example: 0,1,1,2,3,5,8,13,21
     */

        public static void main(String[] args) {
            int fib_value = Fibonacci(8);
            System.out.println("Fibbonacci "+fib_value);//Prints resulting number
        }

        private static int Fibonacci(int n){
            if(n==0 || n==1) //Base case(the small version of the problem) = zero index we have value= 1
                return n; // ensuring recursion terminates.

            //When method calls itself several times, its called recursion.
            return Fibonacci(n-1) + Fibonacci(n-2); //Recursive case
        }
    }

