package CommonExamples;

import java.util.ArrayList;

public class ArrayExtractRepeatedNumbers {
    /*Quiz, given a defined array, extract the number of times each number is repeated
       And print unique number from the list
     */

    public static void main(String [] args) {
        int a[] ={4,5,5,5,4,6,6,9,4};
        // 4 number = 3 times, 5 number = 3 times, 6 number = 2 times, 9 number = one time

        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<a.length; i++ ){
            int k=0; // for every loop key value reset
            if (!al.contains(a[i]))
            {
                al.add(a[i]);
                k++;

                for(int j=i+1; j<a.length; j++){
                    if (a[i]== a[j]) {
                        k++;
                    }
                }
                System.out.println("i value ="+a[i]+" is repeated "+k+"times");
                if (k==1){
                    System.out.println(a[i]+" is unique number");
                }
            }

        }
    }
}
