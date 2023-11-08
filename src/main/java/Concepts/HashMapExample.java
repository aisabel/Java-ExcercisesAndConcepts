package Concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    /*HashMap we map key and a value hs(key,value)
        *Key is the index and value is the element
        *If unordered number is set in the key index then hashmap will create it in that index regardless.
        *Key as index is defined by programmer, is not an automatic assignation.
        *
        * Differences between HashMap and HashTable:
            * Hashmap is not synchronized (concurrency possible) not thread safe.
            * HashTable is thread safe and synchronized.
            * When to use HashMap? if your application do not require any multi-threading task.
            * HashMap allows one null key and any number of null values
            * HashTable do not allow null keys and null values in the HashTable object
            * HashMap object values are iterated by using iterator.
            * HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object
     */

    public static void main(String [] args) {
        HashMap<Integer,String> hs=new HashMap<>();

        //Syntax object.put(key,value)
        hs.put(0,"hello");
        hs.put(1,"world");
        hs.put(2,"hashmap");
        hs.put(3,"example");

        //Print existing values
        System.out.println(hs);

        System.out.println("Element in position 2"+hs.get(2)); //print element in the position 2

        //remove element in index 2
        hs.remove(2);
        System.out.println(hs.get(2)); //will return null, because that index and element does not exist anymore

        //Print existing values
        //Note element in position 2 has been removed, but indexing by key still remains the same
        System.out.println(hs);

        //sm is a set object that points to the set collection
        //convert hashmap into a set by using the 'sm' object
        Set sm = hs.entrySet();

        Iterator it = sm.iterator();

        while(it.hasNext()){
            Map.Entry mp = (Map.Entry)it.next();
            //separate both, key and value and print them
            System.out.println(mp.getKey());//key
            System.out.println(mp.getValue());//value
        }
    }
}
