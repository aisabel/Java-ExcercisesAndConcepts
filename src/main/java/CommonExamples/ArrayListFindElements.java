
package CommonExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFindElements {

    public static void main(String[] args) {
        String[] testStrings = {"Bernard", "Charlie", "Angie", "Andy", "Bertha", "Annie", "Carl", "Dennis", "Caroline", "Bob", "Betty", "Bart", "Albert"};
        System.out.println("Let's begin...");

        //After fulfill the condition, every element will be stored in an array list
        ArrayList<String> originalList = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> bl = new ArrayList<>();
        ArrayList<String> cl = new ArrayList<>();

        for (int i = 0; i < testStrings.length; i++) {
            //add elements from testsStrings to 'original' list
            originalList.add(testStrings[i]);

            //filter elements starting with A and larger than 4 characters
            if (testStrings[i].startsWith("A") && testStrings[i].length() > 4) {
                al.add(testStrings[i]); //Add elements to new array list 'al'
                Collections.sort(al); //Collections.sort() method to sort a list in the natural ascending order

                //Note: 'Andy' is not included in this list because length is exactly 4 chars
                //If the condition would be larger or equal to 4, then Andy will be present in the list

                //filter elements starting with B and larger or equal than 3 characters
            } else if (testStrings[i].startsWith("B") && testStrings[i].length() >= 3) {
                bl.add(testStrings[i]); //Add elements to new array list bl
                Collections.sort(bl); //Collections.sort() method to sort a list in the natural ascending order


                //filter elements starting with C and larger or equal than 5 characters
            } else if (testStrings[i].startsWith("C") && testStrings[i].length() >= 5){
                cl.add(testStrings[i]); //Add elements to new array list cl
                Collections.sort(cl); //Collections.sort() method to sort a list in the natural ascending order

            }
        }
            System.out.println("====================================");
            System.out.println("ACTUAL OUTPUT WHEN MAIN IS EXECUTED:");
            System.out.println("====================================");
            System.out.println("Original collection:" + originalList);
            System.out.println("Sorted & filtered names with A larger than 4 characters:" + al);
            System.out.println("Sorted & filtered names with B equal or larger than 3 characters:" + bl);
            System.out.println("Sorted & filtered names with C equal or larger than 5 characters:" + cl);

    }
}