package collection;

import java.util.TreeMap;

public class NavigableMap {
    public static void main(String[] args) {
        //NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        java.util.NavigableMap<Integer,String> na = new TreeMap<>();
        na.put(1,"ww");
        na.put(9,"jj");
        na.put(3,"oj");
        na.put(8,"pj");
        System.out.println(na);
        //it also have diff methods
        System.out.println(na.descendingKeySet());
        System.out.println(na.pollLastEntry());
    }
}
