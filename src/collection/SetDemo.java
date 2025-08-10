package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //Set<Integer> set = new HashSet<>();//[2, 56, 9] not sorted output
        //Set<Integer> set = new LinkedHashSet<>();//maintain order [56, 9, 2]
        Set<Integer> set = new TreeSet<>();//sorted output [2, 9, 56]
        set.add(56);
        set.add(9);
        set.add(2);
        System.out.println(set);
//all concepts like map and types also
        //in this there is no duplicate values but in map there is duplicate values
        //faster operations
        //map--->HashMap LinkedHashMap TreeMap EnumMap
        //Set -->HashSet LinkedHashMap TreeSet EnumSet

    }
}
