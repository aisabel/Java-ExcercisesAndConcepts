package otherExcercises;

import java.util.Arrays;

public class ArrayConcatenate {
    /*
    Given an integer array arr of length n,
    you want to create an array "ans" of length 2n where
    ans[i] == arr[i] and ans[i + n] == arr[i] for 0 <= i < n (0-indexed).

    Specifically, "ans" is the concatenation of two arr arrays.

    Return the array ans.
     */
    public static void main(String[] args) {
        int[] arr ={1,3,2,1};
        int[] ans=new int[arr.length*2];
        int val=0;
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        for(int i=arr.length;i<(arr.length*2);i++){
            ans[i]=arr[val];
            val++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
