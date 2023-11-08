package otherExcercises;

import java.util.Arrays;
import java.util.Stack;

public class stackFindings {
    /*
    Given an array of integers temperatures represents the daily temperatures,
    return an array answer such that answer[i] is the number of days you have to wait
    after the ith day to get a warmer temperature.
    If there is no future day for which this is possible, keep answer[i] == 0 instead.

    Constraints:
        1 <= temperatures.length <= 10 exp5
        30 <= temperatures[i] <= 100

        Stack.peek() method in Java is used to retrieve or fetch the first element of the Stack
        or the element present at the top of the Stack.
        The element retrieved does not get deleted or removed from the Stack.
        The method returns the element at the top of the Stack else returns NULL if the Stack is empty.
     */

    public static void main(String[] args) {

        //int[] temperatures = {30,40,50,60};
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        //int[] temperatures = {30,60,90};

     Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length ; i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                ans[st.peek()] = i-st.pop();
            }
            st.add(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
