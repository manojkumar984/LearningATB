package ex_collection_framework_list.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab05_map_with_arraylist {
    public static void main(String[] args) {

        HashMap<String,String> student1 = new HashMap<>();
        student1.put("name","manoj");
        student1.put("roll","1");
        student1.put("phone","98988");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap<>();
        student2.put("name","kumar");
        student2.put("roll","2");
        student2.put("phone","1234");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
