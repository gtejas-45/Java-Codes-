package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaExpression {
    public static void main(String[] args) {
        //java 8 feacher
        //minimal code,functional programming
        //contain--lambda expression ,Streams, date & Time API

        //lamda expression --it is anonymous function--(no name,no return type,no access modifier)

        Thread t1 = new Thread(()->{
        System.out.println("hello");
        });

        MathOperation sum = ( a,  b) ->a+b;
        MathOperation sub = ( a,  b) ->a-b;
        int res = sum.operate(1,2);
        System.out.println(res);
        int res1 = sub.operate(1,2);
        System.out.println(res1);

        //predicate
        Predicate<Integer> iseven = x->x%2 ==0;
        System.out.println(iseven.test(8));
        System.out.println(iseven.test(3));

        Predicate<String> str1 = x->x.toLowerCase().startsWith("a");
        Predicate<String> str2 = x->x.toLowerCase().startsWith("a");
        Predicate<String> and = str1.and(str2);
        System.out.println(and);

        //function--work for you
        Function<Integer,Integer> doublenum = x->x*2;
        Function<Integer,Integer> triplenum = x->x*3;
        System.out.println(doublenum.apply(3));
        System.out.println(doublenum.andThen(triplenum).apply(6));
        System.out.println(doublenum.compose(triplenum).apply(6));

        Function<Integer,Integer> identity = Function.identity();
        System.out.println(identity.apply(3));

       // consumer -> consume but don't return anything
        Consumer<Integer> print = x-> System.out.println(x);
        print.accept(33);
       // print.andThen(4).accept(6);
        List<Integer> list = Arrays.asList(2,3,5,4);
        Consumer<List<Integer>>print1 = x->{
            for (int arr : x){
                System.out.println(arr);
            }
        };
        print1.accept(list);

        //supplier -> don't take value but gives value
        Supplier<String> supplier1 = () -> "hello";
        System.out.println(supplier1.get());

        //combined example of all above
        Predicate<Integer> predicate = x->x%2==0;
        Function<Integer,Integer> function = x->x*x;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier = ()->50;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
 //bipredicate
        BiPredicate<Integer,Integer> isaddeven = (x,y)->(x+y)%2==0;
        System.out.println(isaddeven.test(5,4));

        //biconsumer
        BiConsumer<Integer,String > biConsumer = (x,y)->{
            System.out.println(x);
            System.out.println(y);
        };
        //System.out.println(biConsumer.accept(3,"gg"));

        //bifunction
        BiFunction<String,String,Integer> biFunction = (x,y)->(x+y).length();
        System.out.println(biFunction.apply("dd","d"));

        UnaryOperator<Integer> un =x->x*x;
        BinaryOperator<Integer>bi = (x,y)->x+y;

        //method reference -> use method without invoking & in place of lambda expression
        List<String> stud = Arrays.asList("ram","sham","bam");
        stud.forEach(x-> System.out.println(x));
        stud.forEach(System.out::println);





    }
}
//class sum implements MathOperation{
//    @Override
//    public int operate(int a, int b) {                      //to reduce the work we use lambda expression
//        return a+b;
//    }
//}

interface MathOperation{
    int operate(int  a,int b);
}

//class Task implements Runnable(){
//
////    public void run(){
////        System.out.println("hello");
////    }
//}