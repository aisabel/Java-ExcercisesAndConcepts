package CommonDataStructuresAndAlgorithms;

public class SlidingWindow {
/*
The idea behind a sliding window is to consider only valid sub-arrays.
Recall that a sub-array can be defined by a left bound (the index of the first element)
and a right bound (the index of the last element).
In sliding window, we maintain two variables left and right,
which at any given time represent the current sub-array under consideration.

Initially, we have left = right = 0, which means that the first sub-array we look at
is just the first element of the array on its own.
We want to expand the size of our "window", and we do that by incrementing right.
When we increment right, this is like "adding" a new element to our window.

But what if after adding a new element, the sub-array becomes invalid?
We need to "remove" some elements from our window until it becomes valid again.
To "remove" elements, we can increment left, which shrinks our window.

As we add and remove elements, we are "sliding" our window along the input from left to right.
The window's size is constantly changing - it grows as large as it can until it's invalid,
and then it shrinks. However, it always slides along to the right, until we reach the end
of the input.
 */

    public static void main (String [] args){

        int k=8;
        int[] arr = {3,1,2,7,4,2,1,1,5};
        int left = 0; //left: the leftmost index of our current window
        int curr = 0; // curr is the current sum of the window
        int ans = 0; //ans: the length of the longest valid window we have seen so far

        //right: the rightmost index of our current window
        //Iterate right over the input to add elements to the window.
        for (int right = 0; right < arr.length; right++) {
            curr += arr[right]; //Update curr by adding arr[right] to it.

            //while loop reduce the window size
            //When the window becomes invalid (curr > k),
            while (curr > k) {
                curr -= arr[left]; // remove elements from the window by subtracting arr[left] from curr.
                left++; //Then increment left.
            }

            ans = Math.max(ans, right - left + 1); //The size of a window is right - left + 1.
            // Update our answer only when the window becomes valid.
        }

        System.out.println("The longest substring is of size: "+ans);
    }
}
