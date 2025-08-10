package collection;

import java.util.*;

public class CollectionIterable {
    public static void main(String[] args) {
        Collection<String> cl = new ArrayList<>();
        cl.add("ram");
        cl.add("sham");
        for (String n : cl) {
            System.out.println("name: " + cl);

        }
        cl.remove("ram");
        System.out.println(cl);
        Collection<Integer> cl1 = new ArrayList<>();
        cl1.add(24);
        cl1.add(33);
        for (Integer n : cl1) {
            System.out.println("name: " + cl1);

        }
        Collection<Integer> hs1 = new HashSet<Integer>();

        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        System.out.println("Initial set: " + hs1);

        // remove a particular element
        hs1.remove(4);

        System.out.println("Set after removing 4: " + hs1);

        // Creating another object of HashSet
        Collection<Integer> hs2 = new HashSet<Integer>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);

        System.out.println("Collection Elements to be removed: " + hs2);

        // Removing elements from hs1
        // specified in hs2
        // using removeAll() method
        hs1.removeAll(hs2);

        System.out.println("Set 1 after removeAll() operation: " + hs1);


        // Create and populate the list
        Collection<String> l = new LinkedList<>();

        l.add("honny");
        l.add("happy");
        l.add("birthday");

        // Displaying the list
        System.out.println("The list is:" + l);

        // Create an iterator for the list
        // using iterator() method
        Iterator<String> it = l.iterator();

        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values" + " of list are: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}