package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        //linkedlist can act as stack
//        LinkedList<Integer> stack= new LinkedList<>();
//        stack.addFirst(2);
//        stack.addFirst(9);
//        stack.addFirst(3);
//        stack.addFirst(10);
//        System.out.println(stack);//LIFO

        //LINKEDLIST CAN ACT LIKE QUEUE
//        LinkedList<Integer> queue = new LinkedList<>();
//        queue.addLast(2);//ENQUEUE
//        queue.addLast(4);
//        queue.addLast(9);
//        queue.addLast(0);
//
//        System.out.println(queue);//FIFO
//
//        queue.remove();//DEQUEUE
//        System.out.println(queue);
//
//        System.out.println(queue.getFirst());//peek

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove());//Throws exception if queue is empty & reurn the removed element
        System.out.println(queue1.poll());//it return null value if queue is empty //it is good than remove

//        System.out.println(queue1.element());//Throws exception if queue is empty
        System.out.println(queue1.peek());//gives first element

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(3);
        queue2.add(3);
        queue2.offer(2);
        queue2.add(4);
//        queue2.add(5);//we gives capacity is 3 so queue is full we can't add element by add method .//throws exception
        queue2.offer(2);//it return bollen value so exception
        System.out.println(queue2);





    }
}
