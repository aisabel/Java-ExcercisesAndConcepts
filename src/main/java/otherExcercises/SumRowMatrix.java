package otherExcercises;

public class SumRowMatrix {
    /*
    Constraints:

m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100
     */
    public static void main (String[] args) {
        int[][] abc = {{7, 1, 3}, {2, 8, 7}, {1, 9, 5}};
        int maxSumSoFar=0;
        for (int [] customer: abc){
            int currentCustomerSum=0;
            for(int bank: customer){
                currentCustomerSum+=bank;
            }
            maxSumSoFar = Math.max(maxSumSoFar, currentCustomerSum);
            System.out.println(maxSumSoFar);
        }
    }
}
