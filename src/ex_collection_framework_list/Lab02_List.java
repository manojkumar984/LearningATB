package ex_collection_framework_list;

import java.util.ArrayList;
import java.util.List;

public class Lab02_List {
    public static void main(String[] args) {
        List fruits = List.of("apple","mango","water melon","avacado");
        System.out.println(fruits);

        List arrayList = new ArrayList<>();
        arrayList.add("manoj");
        arrayList.add(null);
        arrayList.add("gollapalli");
        arrayList.add("gollapalli"); // duplicate is allowed
        arrayList.add("gollapalli"); // duplicate is allowed
        arrayList.add(123);   // different data type is allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());

    }
}
