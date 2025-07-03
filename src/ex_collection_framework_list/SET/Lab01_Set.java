package ex_collection_framework_list.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab01_Set {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet<>();
        Set ts = new TreeSet();

        hs.add("manoj");
        hs.add("manoj");
        hs.add("manoj");
        hs.add("kumar");
        System.out.println(hs);
    }
}
