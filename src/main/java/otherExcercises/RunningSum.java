package otherExcercises;


public class RunningSum {
    /*
    Given an array num. We define a running sum of an array as runningSum[i] = sum(num[0]…num[i]).
    Return the running sum of num.

Example 1:
Input: num = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: num = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: num = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:
1 <= num.length <= 1000
-10^6 <= num[i] <= 10^6

result:
class Solution {
    public int[] runningSum(int[] num) {
        int [] sum = new int[num.length];
        sum[0] = num[0];
        for(int i=1; i<num.length; i++){
            sum[i]=num[i]+sum[i-1];
        }
     return sum;
    }
}
     */

    public static void main (String [] args) {
        int[] num = {3,1,2,10,1}; //original array
        int[] sum = new int[num.length];//create new array with size of original array
        sum[0] = num[0];//first index value=3
        System.out.println(sum[0]);

        for (int i = 1; i < num.length; i++) {
            sum[i] = num[i] + sum[i - 1];
            System.out.println(sum[i]);
        }

    }
}
