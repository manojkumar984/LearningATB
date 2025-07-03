package ex_collection_framework_list.map;

import java.util.Hashtable;

public class Lab06_hashtable {
    public static void main(String[] args) {

        // no nulls are allows in hashtable

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        System.out.println(ht1);
    }
}
