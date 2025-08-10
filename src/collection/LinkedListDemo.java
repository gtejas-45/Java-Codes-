package collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);

        System.out.println(linkedList.get(0));//2
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.addFirst(7);
        System.out.println(linkedList);
        linkedList.addLast(4);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(3));
        System.out.println(linkedList.remove(1));
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("dog","cow","elephent"));
        LinkedList<String> animalsremove = new LinkedList<>(Arrays.asList("dog","Tiger"));
        animal.removeAll(animalsremove);
        System.out.println(animalsremove);
    }
}
