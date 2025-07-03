package ex_collection_framework_list.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab01_map_p1 {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();

        // map is a key value
        // name : manoj
        // roll no : 26
        // phone : 89789939939

        // put - put the key with value in to the map

        m1.put("name", "manoj");
        m1.put("roll no" , 1);
        m1.put("phone",  898939997);
        System.out.println(m1);

        // for order we have to use linkedhashmap

        m2 = new LinkedHashMap();
        m2.put("Name","Manoj kumar");
        m2.put("Roll no", 1);
        m2.put("phone", 9898);
        System.out.println(m2);

        // for sorting we have to use treemap

    }
}
