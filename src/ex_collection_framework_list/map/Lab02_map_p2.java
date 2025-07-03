package ex_collection_framework_list.map;

import java.util.HashMap;
import java.util.Map;

public class Lab02_map_p2 {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("id1", 1);
        map.put("id2",2);
        map.put("id3",2);
        map.put("id4",2);
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id2"));
    }
}
