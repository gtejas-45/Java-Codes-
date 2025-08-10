package collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;
//in array size is incresed by 1.5 times
//in vector size is incresed by double by previous size if it have size 5 if new element add it double to 10 size
public class VectorDemo {
    public static void main(String[] args) {
//        Vector<Integer> vector = new Vector<>();
//        System.out.println(vector.capacity());//10//initial capacity is 10
        Vector<Integer> vector = new Vector<>(2,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());//5
        vector.add(1,4);
        vector.get(2);
        System.out.println(vector);
        vector.getFirst();
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        vector.size();
        System.out.println(vector);
        vector.set(2,3);
        System.out.println(vector);
        vector.contains(2);
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);
        Vector<Integer> animal1 = new Vector<>(Arrays.asList(1,2,3));
        System.out.println(animal1);

    }
}
