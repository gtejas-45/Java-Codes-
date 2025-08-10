package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

    //Feacher in java 8
        //simplyfy data processing
        //uses functional programming
        //improves readability and maintability
        //easy parallelism
//        List<Integer> numbers = Arrays.asList(,2,3,5,6);
//        int count =0;
//        for(int i : numbers){
//            If( i % 2 ==0){
//                count++;
//            }
//        }
//        System.out.println(count);

        List<String>list = Arrays.asList("anm","ll","mm");
       Stream<String> stream = list.stream().filter(x->x.startsWith("a"));
        System.out.println(stream);




    }
}
