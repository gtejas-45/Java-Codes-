package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.size());

        System.out.println(stack.search(3));

        //linkesdlist as stack -> is best for stack implementation
        LinkedList<Integer> stack1 = new LinkedList<>();
        stack1.add(3);
        stack1.add(6);//push
        stack1.getLast();//peek
        stack1.removeLast();//pop

        //arraylist as stack
        ArrayList<Integer> stack2 = new ArrayList<>();
        stack2.add(2);//push
        stack2.get(stack2.size()-1);//peek
        stack2.remove(stack2.size()-1);




















    }
}
