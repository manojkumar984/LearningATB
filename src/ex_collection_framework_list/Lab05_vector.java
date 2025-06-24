package ex_collection_framework_list;

import java.util.Vector;

public class Lab05_vector {
    public static void main(String[] args) {

        Vector v = new Vector();

        v.add("manoj");
        v.add("manu");
        v.add("kumar");
        System.out.println(v);
        v.remove("kumar");
        System.out.println(v);
    }
}
