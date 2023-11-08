package otherExcercises;

public class ArraySumNumbers {
    public static void main(String[] args) {
        //Retrieve the sum of all elements in an array

        int[] arr = {1,2,3,4,10,11};
        int sum = 0;
        for (int j : arr) {// enhanced for loop
            sum += j;//if it would be an array list instead of array then we need to access element with .get(i)
        }

        System.out.println("The sum of all elements in the array is: "+sum);
    }
}
