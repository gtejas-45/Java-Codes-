package collection;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        //syncronized---thread safe
        //no nulll values
        //implements map
        //slower than hashmap
        //legacy class
       // HashTable<Integer> hashTable= new HashTable<>();
        Hashtable <Integer,String> hashtable = new Hashtable<>();
        hashtable.put(22,"ee");
        hashtable.put(2,"ww");
        System.out.println(hashtable);
        System.out.println(hashtable.get(2));





    }
}
