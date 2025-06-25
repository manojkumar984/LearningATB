package ex_collection_framework_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab07_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("bread");
        list.add("milk");
        list.add("panner");
        list.add("jam");
        list.add("cheese");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(1));

        System.out.println("-----------------");


        for (Object o : list){
            System.out.println(o);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
