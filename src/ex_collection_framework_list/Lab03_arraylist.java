package ex_collection_framework_list;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Lab03_arraylist {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(4);
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("2"));
        System.out.println(list.contains(1));

        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
            
        }
        System.out.println("--------------------");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
