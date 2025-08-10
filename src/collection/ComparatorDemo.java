package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//class StringLengthComparator implements Comparator<String>{
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.length() - o1.length();
//    }
////    public int compare(String s1, String s2){
////        return 0;
////    }
//
//}
//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    }
//}
class Student{
    private String name;
    private double cgpa;
    public Student(String name,double cgpa){
        this.name=name;
        this.cgpa=cgpa;
    }
    public String getname(){return name;}
    public double getcgpa(){
        return cgpa;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
//        List<Integer> c = new ArrayList<>();
//        c.add(1);
//        c.add(4);
//        c.add(20);
//        c.add(13);
////        c.sort(null);//[1,4,13,20]
//  //      c.sort(new MyComparator());//[20, 13, 4, 1]
//
//        //use lambda fuction to avoid this making class
//        c.sort((a,b) ->b-a);
//        System.out.println(c);//[20, 13, 4, 1]
//
//        List<String> s1= Arrays.asList("raj","kundra","rj");
////        s1.sort(null);
// //       s1.sort(new StringLengthComparator());////[kundra, raj, rj]
//        s1.sort((a,b) -> b.length()-a.length());
//        System.out.println(s1);//[kundra, raj, rj]

        List<Student> students =new ArrayList<>();
        students.add(new Student("ram",3.5));
        students.add(new Student("banti",8.0));
        students.add(new Student("shanti",5.5));
       // students.sort(((o1, o2) -> o2.getcgpa() - o1.getcgpa());
        Comparator<Student> comp = Comparator.comparing(Student::getcgpa).reversed().thenComparing(Student::getname);
        students.sort(comp);
        for (Student s : students){
            System.out.println(s.getname()+" : " +s.getcgpa());
        }
    }
}
