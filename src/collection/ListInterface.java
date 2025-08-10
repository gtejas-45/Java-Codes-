package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(34);
        list.add(33);
        System.out.println("Added elements" +list);
        list.set(1,45);
        System.out.println("set element" +list);
        System.out.println("get element at location 1st : " +list.get(1));
       // System.out.println("remove element 33"+list.remove(34));
        System.out.println("search element : "  +list.indexOf(0));
        boolean n = list.contains(34);
        System.out.println(n);


    }
}
