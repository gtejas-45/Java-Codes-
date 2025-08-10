package collection;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        //sortedmap is interface that extends interface map
//        SortedMap<String,Integer> sortedMap = new SortedMap<String, Integer>() {
//            @Override
//            public Comparator<? super String> comparator() {
//                return null;
//            }
//
//            @Override
//            public SortedMap<String, Integer> subMap(String fromKey, String toKey) {
//                return null;
//            }
//
//            @Override
//            public SortedMap<String, Integer> headMap(String toKey) {
//                return null;
//            }
//
//            @Override
//            public SortedMap<String, Integer> tailMap(String fromKey) {
//                return null;
//            }
//
//            @Override
//            public String firstKey() {
//                return "";
//            }
//
//            @Override
//            public String lastKey() {
//                return "";
//            }
//
//            @Override
//            public Set<String> keySet() {
//                return Set.of();
//            }
//
//            @Override
//            public Collection<Integer> values() {
//                return List.of();
//            }
//
//            @Override
//            public Set<Entry<String, Integer>> entrySet() {
//                return Set.of();
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean containsKey(Object key) {
//                return false;
//            }
//
//            @Override
//            public boolean containsValue(Object value) {
//                return false;
//            }
//
//            @Override
//            public Integer get(Object key) {
//                return 0;
//            }
//
//            @Override
//            public Integer put(String key, Integer value) {
//                return 0;
//            }
//
//            @Override
//            public Integer remove(Object key) {
//                return 0;
//            }
//
//            @Override
//            public void putAll(Map<? extends String, ? extends Integer> m) {
//
//            }
//
//            @Override
//            public void clear() {
//
//            }

        // when we use sortedmap it gives all this above method
        SortedMap<String,Integer> sortedMap = new TreeMap<>();//assending order
        //SortedMap<String,Integer> sortedMap = new TreeMap<>((a,b)->b-a);
        sortedMap.put("ram",12);
        sortedMap.put("sham",33);
        sortedMap.put("ani",11);//here keys are string so sorting done by the letter
        System.out.println(sortedMap);
        sortedMap.put("fraud",15);

        //it gives ineresting methods so it is used sorting can done by map interface also
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("fraud"));
        System.out.println(sortedMap.tailMap("sham"));

        SortedMap<Integer,String> map = new TreeMap<>((a,b)->b-a);
        map.put(34,"raj");
        map.put(12,"uaga");
        map.put(39,"ak");
        //map.put(null,"ak");//exception

        System.out.println(map);
    }
}
