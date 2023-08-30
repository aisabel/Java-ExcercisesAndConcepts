package otherExcercises;

public class MatrixSumDiagonal {
    /*Given a square Matrix, calculate the absolute difference between the sums of diagonals
    1 2 3
    4 5 6
    9 8 9

    The left to right diagonal is 1+5+9=15.
    The right to left diagonal is 3+5+9=17
    The absolute difference is 17-15=2

    The primary diagonal is formed by the elements A00, A11, A22, A33 = 15
    *Condition for Principal Diagonal: The row-column condition is row = column.
      The secondary diagonal is formed by the elements A03, A12, A21, A30 = 17
    *Condition for Secondary Diagonal: The row-column condition is row = numberOfRows – column -1.
    */
    public static void main(String[] args) {

        //Solution with Method 1: two loops by column and row
        {
            int[][] abc = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};

            //Left to right diagonal = principal diagonal
            //Right to left diagonal = secondary diagonal
            int principal = 0, secondary = 0;

            for (int i = 0; i < abc.length; i++) {
                for (int j = 0; j < abc.length; j++) {

                    // Condition for principal diagonal
                    if (i == j)
                        principal += abc[i][j];

                    // Condition for secondary diagonal
                    if ((i + j) == (abc.length - 1))
                        secondary += abc[i][j];
                }
            }
            System.out.println("Sum of Principal Diagonal:" + principal);
            System.out.println("Sum of Secondary Diagonal:" + secondary);
        }

        //Solution method 2: optimized
        int[][] abc = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        int principal = 0, secondary = 0;
        for (int i = 0; i < abc.length; i++) {
            principal += abc[i][i];
            secondary += abc[i][abc.length - i - 1];
        }

        System.out.println("Method 2");
        System.out.println("Principal Diagonal:" + principal);
        System.out.println("Secondary Diagonal:" + secondary);

        int absolute = principal-secondary;
        System.out.println("Absolute number between the two diagonals:"+absolute);
    }


    }

