package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* About Map --------
values are in key-value pairs
unique key - no two values have same key
one value for one key */

// order is not in hashmap but in linkedhashmap there is order
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();      //hash--O(1)  if collision O(n)
        hashMap.put( 1 ,"Tejas");
        hashMap.put(2 ,"Sneha");
        hashMap.put(45 ,"not found");//replaced by useful
        hashMap.put(45 ,"useful");
        String h =hashMap.get(2);
        System.out.println(h);//Sneha
        System.out.println(hashMap.containsKey(21));//false
        System.out.println(hashMap.containsValue("Tejas"));//true

        Set<Integer> keys = hashMap.keySet();
        for(int i : keys){
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entrie : entries){
            System.out.println(entrie.getKey() + " : "+entrie.getValue());
        }
        System.out.println(hashMap);

        //if entry is not mapped it cannot removed
        System.out.println(hashMap.remove(45,"raj"));//false
        System.out.println(hashMap.remove(45));//useful
        System.out.println(hashMap);//{1=Tejas, 2=Sneha}
        System.out.println(hashMap.isEmpty());
        //System.out.println(hashMap.replace(45,"heloo"));
        System.out.println(hashMap);
        System.out.println(hashMap.size());
//  hashMap.clear();
//        System.out.println(hashMap);
        hashMap.putIfAbsent(2,"Mahesh");
        System.out.println(hashMap);//don't put because it is present
        hashMap.putIfAbsent(21,"Mahesh");
        System.out.println(hashMap);




    }
}
