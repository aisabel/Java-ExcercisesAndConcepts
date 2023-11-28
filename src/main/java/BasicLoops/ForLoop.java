package BasicLoops;

public class ForLoop {
    /*For loop works as long as the condition is met.
      *Syntax to build a traditional for loop:
        For (Initialization, condition, increment,decrement, or increment by x times(i++ or i--, it can also be i=i+2))
        For (int=0;i<20; i++)

      *Enhanced for loop it is mainly used for traversing array or collections.
      * Syntax:
      * for(data-type variable : array | collection)

      *
     */
    public static void main(String[] args) {

        System.out.println("Traditional for loop");
        //Traditional for loop
        //for( initialization-section ; conditional check ;  increment/decrement section)
        for (int i=0; i<=20; i=i+3){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Enhanced for loop");

        //Enhanced for loop
        int[] array = { 1, 2, 3, 4, 5, 6 };

        // Accessing the element of array
        // using for-each loop
        //for(data-type variable : array | collection)
        for (int a : array) {
            // Print all elements of an array
            System.out.print(a+" ");
        }
    }
}
