package ex_collection_framework_list.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab02_SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("apple");
        hs.add("mango");
        hs.add("water melon");
        hs.add("water melon");
        hs.add(null);
        System.out.println(hs);


        System.out.println("---------------------------");

        Set lhs = new LinkedHashSet();
        // no duplicate order will be maintain
        lhs.add("dapple");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("water melon");
        lhs.add("water melon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());


        System.out.println("_______________________");

        Set ts = new TreeSet<>();
        // order will maintain, natural sorting is done
        // based on the alphabhet the order will come
        // not allows duplicate null and integers
        ts.add("coconut");
        ts.add("banana");
        ts.add("apple");
        ts.add("water melon");
        System.out.println(ts);
    }
}
