package collection;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");

//        Map<String,Integer> map = new HashMap<>();//when we use we can't get two value it use hashing technique
        Map<String,Integer> map = new java.util.IdentityHashMap<>();
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}
