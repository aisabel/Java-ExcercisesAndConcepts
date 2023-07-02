package Concepts;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    /*HashSet, treeSet, LInkedHashset implement Set interface.
        * Set interface does not accept duplicate values, list does. That's the difference
        * Set don't guarantee that elements are stored sequentially, but randomly
        *
        * Iterator method helps to traverse throw each element in the set and print an output
        *
     */

    public static void main(String [] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Netherlands");
        hs.add("Mexico");
        hs.add("UK");
        hs.add("UK"); //Reject duplicated value and only print once UK

        //Print existing values
        System.out.println(hs);

        //Remove specified element and return boolean (true/false)
        System.out.println(hs.remove("UK"));

        //Check if hashSet is empty and return boolean (true/false)
        System.out.println("Is empty: "+hs.isEmpty());

        //check current size
        System.out.println("size "+hs.size());

        //iterator
        Iterator<String> i =  hs.iterator();
        System.out.println(i.next()); //point to the index and print element
        System.out.println(i.next());


    }
}
