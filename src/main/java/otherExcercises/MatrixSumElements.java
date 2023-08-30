package otherExcercises;

public class MatrixSumElements {
    /*Given a square Matrix, sum the row elements
    1 2 3
    4 5 6
    9 8 9

     */

    public static void main(String[] args) {
        int[][] abc = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};

        int rows = abc.length;
        int cols = abc[0].length;

        for(int i = 0; i < rows; i++){
            int sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + abc[i][j];
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);
        }

        //Calculates sum of each column of given matrix
        for(int i = 0; i < cols; i++){
            int sumCol = 0;
            for (int j = 0; j < rows; j++){
                sumCol = sumCol + abc[j][i];
            }
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);
        }
    }
}


