package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        //allows insertion and deletion from both end
        //double ended queue
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addLast(9);
        deque.addFirst(2);
        deque.offerFirst(7);
        deque.offerLast(3);
        System.out.println(deque);//[7, 2, 3, 9, 3]

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println(deque.removeFirst());
        System.out.println( deque.pollFirst());

        for(int de : deque){
            System.out.println(de);
        }


    }
}
