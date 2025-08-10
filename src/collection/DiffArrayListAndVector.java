package collection;

import java.util.ArrayList;
import java.util.Vector;

public class DiffArrayListAndVector {
    public static void main(String[] args) {


//    Vector<Integer>  list = new Vector<>();
        ArrayList<Integer>  list = new ArrayList<>();
    Thread t1 = new Thread(() -> {
        for(int i = 0; i < 1000; i++) {
            list.add(i);
        }
    });
    Thread t2 = new Thread(()->{
        for(int i = 0; i < 1000; i++) {
            list.add(i);
        }
    });
    t1.start();
    t2.start();
    try{
        t1.join();
        t2.join();
    }catch (InterruptedException e){
        e.printStackTrace();
    }
        System.out.println(list.size());//2000 when vector because vector is synchronized means thread safe
    }//1010//when we declare arraylist it may vary numbers in output
}
