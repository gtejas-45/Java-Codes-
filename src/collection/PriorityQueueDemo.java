package collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //queue interface part
        //based on natural ordering
        //don't aloow null values
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.offer(39);
        priorityQueue.offer(34);
        System.out.println(priorityQueue);//no sorted order maintain
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }


    }
}
