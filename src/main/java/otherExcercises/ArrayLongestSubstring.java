package otherExcercises;

public class ArrayLongestSubstring {
    /*
    Given an integer array nums and an integer k,
    find the sum of the subarray with the largest sum whose length is k.

    Result: 18 because the size of the window is fixed number which means k=4
    -3 + -1 + 4 + 12= 18 --> This is the maximum number
    -1 + 4 + 12 + -8 = 7;
    4 + 12 + -8 + 5 = 13;
    12 + -8 + 5 + 6 = 15
    */
    public static void main(String[] args) {
        int k=4; //fixed size window
        int[] arr ={3,-1,4,12,-8,5,6};
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }

        int ans = curr;
        for (int i = k; i < arr.length; i++) {
            curr += arr[i] - arr[i - k];
            ans = Math.max(ans, curr); // Java.lang.math.max() function is an inbuilt function in Java which returns maximum of two numbers.
        }

        System.out.println("The longest substring is of size: " + ans);
    }
}
