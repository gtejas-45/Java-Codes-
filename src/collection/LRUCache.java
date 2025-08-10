package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public  class LRUCache<k,v> extends LinkedHashMap<k,v>{
    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size() > capacity;
    }



    public static void main(String[] args) {
        LRUCache<Integer,String> lruCache = new LRUCache<>(2);
        lruCache.put(2,"Hello");//least recently removed
        lruCache.put(1,"tarak");
        lruCache.put(8,"Mahata");
        System.out.println(lruCache);


    }
}
