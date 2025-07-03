package ex_collection_framework_list.SET;

import java.util.HashSet;
import java.util.Iterator;

public class Lab03_HS {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("orange");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("set elements: " + set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
