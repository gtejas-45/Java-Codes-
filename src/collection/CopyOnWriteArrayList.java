package collection;

import java.util.List;

public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        List<String> shopping = new java.util.concurrent.CopyOnWriteArrayList<>();
        shopping.add("eggs");
        shopping.add("milk");
        System.out.println(shopping);

        for(String itm : shopping){
            System.out.println(itm);
            if(itm.equals("eggs")){
                shopping.add("onion");
            }
        }
        System.out.println(shopping);
    }
}
