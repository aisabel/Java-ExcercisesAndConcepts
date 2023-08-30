package BasicLoops;

public class Arrays {

    public static void main (String[] args) {

        //Array is a container which stores multiple values of the same datatype. Collection of values.
        //Single dimensions array described below:

        System.out.println("Single dimension array with memory allocation: ");

        //Below traditional array declaration (a) and allocate memory for the values
        //By adding number 4 means array size (quantity of spaces will be set up in memory)
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        //For loop is an incremental check the size of the array and store it in variable i
        for (int i=0; i<a.length ; i++){
            //Prints the content of array (a) in the position i
            System.out.println(a[i]);
        }

        //Single dimensions array described dynamically
        System.out.println("Single dimension array dynamically constructed: ");

        //Below an array b with defined and dynamic memory allocations and directly passing the values
        int [] b = {6,7,8,9,10};

        //For loop is an incremental check the size of the array and store it in variable i
        for (int i=0; i<b.length ; i++){
            //Prints the content of array b in the position i
            System.out.println(b[i]);
        }

        //Multidimensional arrays:
        /* Imagine a matrix as below, containing values where x= row and y=column
           2  4 5
           3  4 7

           where c[row][column]
         */
        int[][] c = new int [2][3];
        //c[row][column]
        c[0][0] = 2;
        c[0][1] = 4;
        c[0][2] = 5;
        c[1][0] = 3;
        c[1][1] = 4;
        c[1][2] = 7;

        System.out.println("Multidimensional array values");

        //To print all the values within the array is necessary to add a for loop
        for (int i=0; i < c.length; i++) {
            for (int j = 0; j <= c.length; j++) {
                //Print Multidimensional array values
                System.out.print(c[i][j]);
                System.out.print("\t"); //prints a space between numbers
            }
            //println jump to the next row
            System.out.println("");
        }

        //Prints the value in that specific position = 3
        System.out.println("Example: Multidimensional array value in second row, first column: "+c[1][0]);

        //Prints Multidimensional array within their positions
        System.out.println("Multidimensional array values within their positions");
        int[][] abc = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                System.out.println("abc[" + i + "][" + j + "] = " + abc[i][j]);
            }
        }
    }
}
