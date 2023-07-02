package BasicLoops;

public class ForNestedLoop {
    /*For loop works as long as the condition is met.
      *Syntax to build a for loop:
        For (Initialization, condition, increment,decrement, or increment by x times(i++ or i--, it can also be i=i+2))
        For (int=0;i<20; i++)

       *Important! Until inner loop is executed, then outer loop will continue
     */
    public static void main(String[] args) {

        for (int i=1; i<=4; i++){//outer for loop will execute 4 times
            System.out.println(i +" outer loop round");

            for(int j=1; j<=5; j++){
                System.out.println(j);//print j value from inner loop
            }
        }
    }
}
