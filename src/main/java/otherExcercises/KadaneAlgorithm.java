package otherExcercises;

public class KadaneAlgorithm {
    /*Quiz: Given an array arr[] of size N.
        The task is to find the sum of the contiguous sub array within a arr[] with the largest sum.

        The idea of Kadane’s algorithm is to maintain a variable max_ending_here that stores the maximum
        sum contiguous sub array ending at current index and a variable max_so_far stores the maximum sum
        of contiguous sub array found so far,
        Everytime there is a positive-sum value in max_ending_here compare it with max_so_far and update
        max_so_far if it is greater than max_so_far.

So the main Intuition behind Kadane’s algorithm is,
     */
    public static void main(String[] args)
    {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }

    // Function Call
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
