package collection;
//from where you learn --https://youtu.be/92k5uokmW9o?si=W16HZaHvs0-Iz4p_
import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();//arraylist class imolement list interface
        list1.add("Ram");//adding elements to list
        list1.add("Shita");
        list1.add("Lakshiman");
        list1.add("Ravan");

        list1.sort(null);//sorting in ascending order
        System.out.println(list1);



        System.out.println(list1.size());//4
        System.out.println(list1);//[Ram, Shita, Lakshiman, Ravan]

//In Java, the trimToSize() method is used to reduce the capacity of an ArrayList to match its current size. This helps to optimize memory usage when an ArrayList contains less elements than its allocated capacity.
       list1.trimToSize();//firstly there is 10 size later it reduces to 4 by trimming
        System.out.println(list1);
        System.out.println(list1.subList(0,2));//[Ram, Shita]


//        list1.remove(1);
//        System.out.println(list1);//[Ram, Lakshiman, Ravan]
//        list1.add(2,"Ramayan");
//        System.out.println(list1);//[Ram, Shita, Ramayan, Lakshiman, Ravan] //added to second index

//Arraylist.contains() In Java, the ArrayList contains() method is used to check if the specified element exists in an ArrayList or not
//        System.out.println(list1.contains("Shita"));//true
//        System.out.println(list1.contains("shita"));

//        List<String> list2= new ArrayList<>();
//        list2.add("war");
//        list1.addAll(list2);//it adding two arraylist
//        System.out.println(list2);//[war]
//        System.out.println(list1);//[Ram, Shita, Ramayan, Lakshiman, Ravan, war]

        //adding new list to specific we use index in this
//        list1.addAll(2,list2);
//        System.out.println(list1);//[Ram, Shita, war, Ramayan, Lakshiman, Ravan]

        //clearing string values
//        list1.clear();
//        System.out.println(list1);//[] empty array

//The listIterator() method of ArrayList class in Java is used to return a ListIterator for traversing the elements of the list in proper sequence. The iterator allows both forward and backward traversal of the list
        ListIterator<String> m = list1.listIterator(2);
        while (m.hasNext()) {
            System.out.println(m.next());//Lakshiman
                                        // Ravan
        }


        // create an ArrayList of Integers
        ArrayList<Integer> l = new ArrayList<>();

        // preallocate capacity for 5 elements
        l.ensureCapacity(5);

        // Add elements to the ArrayList
        for (int i = 1; i <= 5; i++) {
            l.add(i);
        }

        System.out.println(l);

//In Java, the ArrayList.forEach() method is used to iterate over each element of an ArrayList and perform certain operations for each element in ArrayList.
//        l.forEach(System.out::println); //12345 in newline
//        l.forEach(System.out::print);//12345 in single line

//The indexOf() method in Java is used to find the index of the first occurrence of a specified element in an ArrayList.
        int s = l.indexOf(1);
        int s1 = l.lastIndexOf(4);

        System.out.println(s);// 0
        System.out.println(s1);//3

//In Java, the isEmpty() method of ArrayList is used to check if an ArrayList is empty.
//        l.clear();
//        System.out.println(l);//[]
//
//        System.out.println(l.isEmpty()); //true

    }
}
