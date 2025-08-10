package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMapDemo = new LinkedHashMap<>();
        linkedHashMapDemo.put("tej",6);
        linkedHashMapDemo.put("Raj",2);
        linkedHashMapDemo.put("raju",45);

        linkedHashMapDemo.get("raju");
        linkedHashMapDemo.get("Raj");
        for (Map.Entry<String,Integer> entry: linkedHashMapDemo.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

        //we can use all hashmap methods
    }
}
