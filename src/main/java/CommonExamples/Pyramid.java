package CommonExamples;

public class Pyramid {
    /*Quiz: Print an inverted pyramid of numbers from 1 to 10
        1  2  3  4
        5  6  7
        9 10
        And print also normal pyramid from 1 to 10
        1
        2  3
        4  5  6
        7  8  9  10

       *Important! Until inner loop is executed, then outer loop will continue
     */
    public static void main(String[] args) {

        //Print numbers inverted pyramid
        int k=1; //k variable is just to increment the number in the count
        for (int i=0; i<=4; i++){//outer for loop will execute 4 times

            for(int j=1; j<=4-i; j++){
                System.out.print(k);//print k value from inner loop
                System.out.print("\t");
                k++;
            }
            System.out.println(""); //Once inner loop is completed then jump to next line
        }

        //Print numbers normal pyramid
        int a=1; //a variable is just to increment the number in the count
        for (int i=1; i<=4; i++){//outer for loop will execute 4 times

            for(int j=1; j<=i; j++){
                System.out.print(a);//print k value from inner loop
                System.out.print("\t");
                a++;
            }
            System.out.println(""); //Once inner loop is completed then jump to next line
        }

    }
}
