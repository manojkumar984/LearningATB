package ex_collection_framework_list.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab03_map_real {
    public static void main(String[] args) {

        Map<String,Object> student1 = new LinkedHashMap<>();
        student1.put("name", "manoj");
        student1.put("phone", "98989");
        student1.put("address", "hyderabad");
        student1.put("home address", "Jublieee");

        System.out.println(student1);


    }
}
