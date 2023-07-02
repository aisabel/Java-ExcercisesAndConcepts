package Concepts;

import java.util.ArrayList;

public class ArrayListExample {
    /*
        *ArrayList has a dynamic size which can add or decrease size
        *ArrayList accepts duplicate content, because it becomes an element
        *Normal array have fixed size, where arrayList can grow dynamically
        *Access and insert any value in any index in ArrayList

     */

    public static void main(String [] args) {
        //Create an object and Specify the data type <string>
        ArrayList<String> a= new ArrayList<>();

        //Add elements to the arrayList
        a.add("Isabel");
        a.add("java");
        //Print list of existing added elements
        System.out.println(a);

        //Adds an element into the array list in the position 2
        a.add(2,"student");

        //Print new list with elements added
        System.out.println(a);

        //Remove element in position 1 from the list
        a.remove(1);

        //Remove specified element
        a.remove("java");

        //Get will retrieve the element in position 1
        System.out.println(a.get(1));

        //Retrieve boolean (true/false) either 'testing' is present in the list
        System.out.println(a.contains("testing"));

        //Print the index where the specified text is located
        System.out.println(a.indexOf("Isabel"));

        //Check if the array list is empty
        System.out.println(a.isEmpty());

        //check array list size, number of elements in the array
        System.out.println(a.size());

    }
}
