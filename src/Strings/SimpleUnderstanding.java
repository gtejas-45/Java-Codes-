package Strings;

public class SimpleUnderstanding {
    public static void main(String[] args) {
        String name = "Tejas";
        String name1 = "Tejas";//the name2 donot create new obj it uses the already created obj that is Tejas in String pool
        System.out.println(name == name1);//true  //These two values are in string pool so this are same

        String name3 = new String("Tejas");//it create new memeory outside the string pool that is in heap
        String name4 = new String("Tejas");
        System.out.println(name3 == name4);//false  //this are not same they are in heap memory

        System.out.println(name3.equals(name4));//true //it checks letters

    }
}
