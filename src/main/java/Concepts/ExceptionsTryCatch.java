package Concepts;

public class ExceptionsTryCatch {
    /*
       * If there's a possibility of an error use try catch mechanism
       * 'try' block is to check if code fails, and handle request in a different way,
        and it will be written within the catch section.
       * In other words, try catch is to test some code and execute an action if the code fail
       * One 'try' block can be followed by multiple catch blocks
       * Rule: In between catch blocks: don't write any other code
       *
       * 'Finally' block execute all the code statements in that block, even after catch exceptions
       * Finally can also be used in combination with try, without defining any catch
       * Finally block will not be executed when jvm is forced to stop

     */

    public static void main(String [] args) {
            int b=7;
            int c=0;

            int[] arr;
             arr = new int[5];

        //execute/test code
            try{
                int k=b/c;//divide by zero is an automatic exception
                System.out.println(k);
            }

            //Catch specific to arithmetic exception
            catch(ArithmeticException et){
                System.out.println("This is specific arithmetic exception");
            }

            try{
                //Try to print position 7 from the array, but array is defined with 5 positions,
                // therefore it doesn't work and should lead to exception
                System.out.println(arr[7]);
            }
            //Catch specific to outOfBoundaries exception
            catch(IndexOutOfBoundsException et){
                System.out.println("This is exception indexOutOfBoundaries");
            }
            //generic exception catches everything, all kinds of exceptions
            catch(Exception e){
                System.out.println("Catch error exception");
            }
            finally{
                System.out.println("Finally delete everything afterwards");
            }
        }

    }

